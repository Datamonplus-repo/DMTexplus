package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apprc128 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apprc128 pgm = new apprc128 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apprc128( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apprc128.class ), "" );
   }

   public apprc128( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV38UsurCod = " " ;
      AV39Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV40EmprCod ;
      GXv_char2[0] = AV41EmprNom ;
      GXv_char3[0] = AV38UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char1, GXv_char2, GXv_char3) ;
      apprc128.this.AV40EmprCod = GXv_char1[0] ;
      apprc128.this.AV41EmprNom = GXv_char2[0] ;
      apprc128.this.AV38UsurCod = GXv_char3[0] ;
      AV78Usumail = " " ;
      /* Using cursor P05LW2 */
      pr_default.execute(0, new Object[] {AV38UsurCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A850UsurCod = P05LW2_A850UsurCod[0] ;
         A10513UsuMail = P05LW2_A10513UsuMail[0] ;
         AV78Usumail = A10513UsuMail ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXt_char4 = AV58Host ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "MAISVR", ""), GXv_char3) ;
      apprc128.this.GXt_char4 = GXv_char3[0] ;
      AV58Host = GXt_char4 ;
      GXt_int5 = AV59HostPort ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "MAISVR", ""), GXv_int6) ;
      apprc128.this.GXt_int5 = GXv_int6[0] ;
      AV59HostPort = GXt_int5 ;
      AV59HostPort = ((AV59HostPort==0) ? 25 : AV59HostPort) ;
      GXt_char4 = AV73Remitente ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "MAIDE", ""), GXv_char3) ;
      apprc128.this.GXt_char4 = GXv_char3[0] ;
      AV73Remitente = GXt_char4 ;
      GXt_char4 = AV74Remitentemail ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "MAIDEM", ""), GXv_char3) ;
      apprc128.this.GXt_char4 = GXv_char3[0] ;
      AV74Remitentemail = GXt_char4 ;
      GXt_int5 = AV61MailLogin ;
      GXv_char3[0] = AV40EmprCod ;
      GXv_char2[0] = httpContext.getMessage( "MAIUSR", "") ;
      GXv_int6[0] = GXt_int5 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int6) ;
      apprc128.this.AV40EmprCod = GXv_char3[0] ;
      apprc128.this.GXt_int5 = GXv_int6[0] ;
      AV61MailLogin = (byte)(GXt_int5) ;
      GXt_char4 = AV64MailType ;
      GXv_char3[0] = GXt_char4 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "MAITYP", ""), GXv_char3) ;
      apprc128.this.GXt_char4 = GXv_char3[0] ;
      AV64MailType = GXt_char4 ;
      if ( AV61MailLogin == 1 )
      {
         GXt_char4 = AV77usuarioAutentificacion ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "MAIUSR", ""), GXv_char3) ;
         apprc128.this.GXt_char4 = GXv_char3[0] ;
         AV77usuarioAutentificacion = GXt_char4 ;
         GXt_char4 = AV72passwordAutentificacion ;
         GXv_char3[0] = GXt_char4 ;
         new app.core.pbusdsc2(remoteHandle, context).execute( AV40EmprCod, httpContext.getMessage( "MAIPSW", ""), GXv_char3) ;
         apprc128.this.GXt_char4 = GXv_char3[0] ;
         AV72passwordAutentificacion = GXt_char4 ;
      }
      AV80CliMailGr = httpContext.getMessage( "jleon@datamonplus.com", "") ;
      AV81Clinom = httpContext.getMessage( "Juan", "") ;
      AV52DirTo.setAddress( AV80CliMailGr );
      AV52DirTo.setName( AV81Clinom );
      AV53Envio.getTo().removeAllItems();
      AV53Envio.getTo().add(AV52DirTo);
      AV55FicheroAdjunto = AV56Filename ;
      AV53Envio.getAttachments().add(AV55FicheroAdjunto);
      AV51DirCc.setAddress( AV78Usumail );
      AV51DirCc.setName( AV41EmprNom );
      AV53Envio.getCc().removeAllItems();
      AV53Envio.getCc().add(AV51DirCc);
      AV46Asunto = httpContext.getMessage( "Envio Albaranes", "") ;
      AV60HTMLText = ((GXutil.strcmp("", AV60HTMLText)==0) ? httpContext.getMessage( "Relacion de Albaranes", "") : AV60HTMLText) ;
      AV53Envio.setSubject( AV46Asunto );
      AV53Envio.setHtmltext( AV60HTMLText );
      if ( GXutil.strcmp(AV64MailType, httpContext.getMessage( "SMTP", "")) == 0 )
      {
         AV66MensSMTP.setHost( AV58Host );
         AV66MensSMTP.getSender().setName( AV73Remitente );
         AV66MensSMTP.getSender().setAddress( AV74Remitentemail );
         AV66MensSMTP.setAuthentication( (short)(1) );
         AV66MensSMTP.setUserName( AV77usuarioAutentificacion );
         AV66MensSMTP.setPassword( AV72passwordAutentificacion );
         AV66MensSMTP.login();
         AV66MensSMTP.send(AV53Envio);
         if ( AV66MensSMTP.getErrCode() != 0 )
         {
            httpContext.GX_msglist.addItem(AV66MensSMTP.getErrDescription());
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Mail enviado....", ""));
         }
         AV66MensSMTP.logout();
      }
      if ( GXutil.strcmp(AV64MailType, httpContext.getMessage( "MAPI", "")) == 0 )
      {
         AV65Mensaje.setEditWindow( (short)(1) );
         AV65Mensaje.Send(AV53Envio);
         if ( AV65Mensaje.getErrCode() != 0 )
         {
            httpContext.GX_msglist.addItem(AV65Mensaje.getErrDescription());
         }
         else
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Mail enviado....", ""));
         }
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pprc128.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      AV65Mensaje.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV38UsurCod = "" ;
      AV39Station = "" ;
      AV40EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV41EmprNom = "" ;
      AV78Usumail = "" ;
      scmdbuf = "" ;
      P05LW2_A850UsurCod = new String[] {""} ;
      P05LW2_A10513UsuMail = new String[] {""} ;
      A850UsurCod = "" ;
      A10513UsuMail = "" ;
      AV58Host = "" ;
      AV73Remitente = "" ;
      AV74Remitentemail = "" ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new int[1] ;
      AV64MailType = "" ;
      AV77usuarioAutentificacion = "" ;
      AV72passwordAutentificacion = "" ;
      GXt_char4 = "" ;
      GXv_char3 = new String[1] ;
      AV80CliMailGr = "" ;
      AV81Clinom = "" ;
      AV52DirTo = new com.genexus.internet.MailRecipient();
      AV53Envio = new com.genexus.internet.GXMailMessage();
      AV55FicheroAdjunto = "" ;
      AV56Filename = "" ;
      AV51DirCc = new com.genexus.internet.MailRecipient();
      AV46Asunto = "" ;
      AV60HTMLText = "" ;
      AV66MensSMTP = new com.genexus.internet.GXSMTPSession();
      AV65Mensaje = new com.genexus.gxoffice.OutlookSession();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apprc128__default(),
         new Object[] {
             new Object[] {
            P05LW2_A850UsurCod, P05LW2_A10513UsuMail
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV61MailLogin ;
   private short Gx_err ;
   private int AV59HostPort ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private String AV38UsurCod ;
   private String AV39Station ;
   private String AV40EmprCod ;
   private String GXv_char1[] ;
   private String AV41EmprNom ;
   private String AV78Usumail ;
   private String scmdbuf ;
   private String A850UsurCod ;
   private String A10513UsuMail ;
   private String AV58Host ;
   private String AV73Remitente ;
   private String AV74Remitentemail ;
   private String GXv_char2[] ;
   private String AV64MailType ;
   private String AV77usuarioAutentificacion ;
   private String AV72passwordAutentificacion ;
   private String GXt_char4 ;
   private String GXv_char3[] ;
   private String AV80CliMailGr ;
   private String AV81Clinom ;
   private String AV46Asunto ;
   private String AV60HTMLText ;
   private String AV55FicheroAdjunto ;
   private String AV56Filename ;
   private com.genexus.internet.MailRecipient AV52DirTo ;
   private com.genexus.internet.MailRecipient AV51DirCc ;
   private com.genexus.internet.GXSMTPSession AV66MensSMTP ;
   private com.genexus.gxoffice.OutlookSession AV65Mensaje ;
   private IDataStoreProvider pr_default ;
   private String[] P05LW2_A850UsurCod ;
   private String[] P05LW2_A10513UsuMail ;
   private com.genexus.internet.GXMailMessage AV53Envio ;
}

final  class apprc128__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05LW2", "SELECT UsurCod, UsuMail FROM TXPUSUARI WHERE UsurCod = ? ORDER BY UsurCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

