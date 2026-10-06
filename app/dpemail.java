package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class dpemail extends GXProcedure
{
   public dpemail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( dpemail.class ), "" );
   }

   public dpemail( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public app.SdtEmails executeUdp( String aP0 )
   {
      dpemail.this.aP1 = new app.SdtEmails[] {new app.SdtEmails()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String aP0 ,
                        app.SdtEmails[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             app.SdtEmails[] aP1 )
   {
      dpemail.this.AV5EmprCod = aP0;
      dpemail.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV5EmprCod, "MAIUSR", GXv_char2) ;
      dpemail.this.GXt_char1 = GXv_char2[0] ;
      Gxm1emails.getgxTv_SdtEmails_Config().setgxTv_SdtEmails_Config_User( GXutil.trim( GXt_char1) );
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV5EmprCod, "MAIPSW", GXv_char2) ;
      dpemail.this.GXt_char1 = GXv_char2[0] ;
      Gxm1emails.getgxTv_SdtEmails_Config().setgxTv_SdtEmails_Config_Password( GXutil.trim( GXt_char1) );
      Gxm1emails.getgxTv_SdtEmails_Config().setgxTv_SdtEmails_Config_Authentication( true );
      Gxm1emails.getgxTv_SdtEmails_Config().setgxTv_SdtEmails_Config_Security( true );
      GXt_int3 = 0 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( AV5EmprCod, "MAISVR", GXv_int4) ;
      dpemail.this.GXt_int3 = GXv_int4[0] ;
      Gxm1emails.getgxTv_SdtEmails_Config().setgxTv_SdtEmails_Config_Port( (short)(GXt_int3) );
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV5EmprCod, "MAIDEM", GXv_char2) ;
      dpemail.this.GXt_char1 = GXv_char2[0] ;
      Gxm1emails.getgxTv_SdtEmails_Config().setgxTv_SdtEmails_Config_Email( GXutil.trim( GXt_char1) );
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV5EmprCod, "MAISVR", GXv_char2) ;
      dpemail.this.GXt_char1 = GXv_char2[0] ;
      Gxm1emails.getgxTv_SdtEmails_Config().setgxTv_SdtEmails_Config_Smtp( GXutil.trim( GXt_char1) );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = dpemail.this.Gxm1emails;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm1emails = new app.SdtEmails(remoteHandle, context);
      GXv_int4 = new int[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private String AV5EmprCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private app.SdtEmails[] aP1 ;
   private app.SdtEmails Gxm1emails ;
}

