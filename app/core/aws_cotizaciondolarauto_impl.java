package app.core ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aws_cotizaciondolarauto_impl extends GXWebProcedure
{
   public aws_cotizaciondolarauto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV14TRMSDT_Data ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.ws_cotizaciondolar(remoteHandle, context).execute( Gx_date, GXv_char2) ;
      aws_cotizaciondolarauto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14TRMSDT_Data = GXt_char1 ;
      if ( (GXutil.strcmp("", AV14TRMSDT_Data)==0) )
      {
         System.out.println( httpContext.getMessage( "DTM-TRACE: No se obtuvo cotización WS dolar", "") );
      }
      else
      {
         /* Using cursor P09R92 */
         pr_default.execute(0);
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P09R92_A396EmprCod[0] ;
            AV8EmprCod = A396EmprCod ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         /* Using cursor P09R93 */
         pr_default.execute(1);
         while ( (pr_default.getStatus(1) != 101) )
         {
            A3100DivNom = P09R93_A3100DivNom[0] ;
            n3100DivNom = P09R93_n3100DivNom[0] ;
            A3099DivCod = P09R93_A3099DivCod[0] ;
            if ( GXutil.like( GXutil.upper( GXutil.trim( A3100DivNom)) , GXutil.padr( httpContext.getMessage( "%DOLAR%", "") , 254 , "%"),  ' ' ) )
            {
               AV13TRMDivID = A3099DivCod ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GXv_objcol_SdtMessages_Message3[0] = AV11Messages ;
         new app.ficherosbasicos.trm_agregarcotizacionpr(remoteHandle, context).execute( AV8EmprCod, AV13TRMDivID, AV14TRMSDT_Data, GXv_objcol_SdtMessages_Message3) ;
         AV11Messages = GXv_objcol_SdtMessages_Message3[0] ;
         if ( AV11Messages.size() == 0 )
         {
            System.out.println( httpContext.getMessage( "DTM-TRACE: Proceso finalizado", "") );
         }
         else
         {
            System.out.println( httpContext.getMessage( "DTM-TRACE: ", "")+AV11Messages.toJSonString(false) );
         }
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV14TRMSDT_Data = "" ;
      GXt_char1 = "" ;
      Gx_date = GXutil.nullDate() ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P09R92_A396EmprCod = new String[] {""} ;
      A396EmprCod = "" ;
      AV8EmprCod = "" ;
      P09R93_A3100DivNom = new String[] {""} ;
      P09R93_n3100DivNom = new boolean[] {false} ;
      P09R93_A3099DivCod = new byte[1] ;
      A3100DivNom = "" ;
      AV11Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message3 = new GXBaseCollection[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.core.aws_cotizaciondolarauto__default(),
         new Object[] {
             new Object[] {
            P09R92_A396EmprCod
            }
            , new Object[] {
            P09R93_A3100DivNom, P09R93_n3100DivNom, P09R93_A3099DivCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte A3099DivCod ;
   private byte AV13TRMDivID ;
   private short gxcookieaux ;
   private short Gx_err ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String AV8EmprCod ;
   private String A3100DivNom ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n3100DivNom ;
   private String AV14TRMSDT_Data ;
   private IDataStoreProvider pr_default ;
   private String[] P09R92_A396EmprCod ;
   private String[] P09R93_A3100DivNom ;
   private boolean[] P09R93_n3100DivNom ;
   private byte[] P09R93_A3099DivCod ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message3[] ;
}

final  class aws_cotizaciondolarauto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09R92", "SELECT * FROM (SELECT EmprCod FROM TXPEMPRES ORDER BY EmprCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09R93", "SELECT DivNom, DivCod FROM TXPDIVISA ORDER BY DivCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

