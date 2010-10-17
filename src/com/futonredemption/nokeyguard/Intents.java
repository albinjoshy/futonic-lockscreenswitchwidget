package com.futonredemption.nokeyguard;

import android.content.Context;
import android.content.Intent;

public class Intents
{
	public static final Intent disableKeyguard(Context context)
	{
		final Intent result = new Intent(context, DisableKeyguardService.class);
		result.putExtra(DisableKeyguardService.EXTRA_RemoteAction, DisableKeyguardService.RemoteAction_DisableKeyguard);
		
		return result;
	}
	
	public static final Intent enableKeyguard(Context context)
	{
		final Intent result = new Intent(context, DisableKeyguardService.class);
		result.putExtra(DisableKeyguardService.EXTRA_RemoteAction, DisableKeyguardService.RemoteAction_EnableKeyguard);
		
		return result;
	}
	
	public static final Intent refreshWidgets(Context context)
	{
		final Intent result = new Intent(context, DisableKeyguardService.class);
		result.putExtra(DisableKeyguardService.EXTRA_RemoteAction, DisableKeyguardService.RemoteAction_RefreshWidgets);
		
		return result;
	}
}
