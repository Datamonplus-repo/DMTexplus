package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pctrlhashanterior_2 extends GXProcedure
{
   public pctrlhashanterior_2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pctrlhashanterior_2.class ), "" );
   }

   public pctrlhashanterior_2( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             long aP2 )
   {
      pctrlhashanterior_2.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             String[] aP3 )
   {
      pctrlhashanterior_2.this.A396EmprCod = aP0;
      pctrlhashanterior_2.this.AV8ALbProPri = aP1;
      pctrlhashanterior_2.this.AV17AlbProcod = aP2;
      pctrlhashanterior_2.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV16Noaplicar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NOHAAN", ""), GXv_int2) ;
      pctrlhashanterior_2.this.GXt_int1 = GXv_int2[0] ;
      AV16Noaplicar = GXt_int1 ;
      AV9Msg_control = " " ;
      if ( AV16Noaplicar == 1 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char3 = AV10ddmmaaaa ;
      GXv_char4[0] = GXt_char3 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      pctrlhashanterior_2.this.GXt_char3 = GXv_char4[0] ;
      AV10ddmmaaaa = GXt_char3 ;
      AV10ddmmaaaa = ((GXutil.strcmp(AV10ddmmaaaa, " ")==0) ? "02/04/12" : AV10ddmmaaaa) ;
      AV11Fecha = localUtil.ctod( AV10ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV12ContCod = ((GXutil.strcmp(AV8ALbProPri, "0")==0) ? "555555" : "666666") ;
      GXv_int5[0] = AV14ContVal ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, AV12ContCod, GXv_int5) ;
      pctrlhashanterior_2.this.AV14ContVal = GXv_int5[0] ;
      AV13AlbFmd = " " ;
      AV15calprd = (byte)(0) ;
      /* Using cursor P0AJI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8ALbProPri, Long.valueOf(AV17AlbProcod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P0AJI2_A30AlbProCod[0] ;
         A39AlbProPri = P0AJI2_A39AlbProPri[0] ;
         A10017AlbFmd = P0AJI2_A10017AlbFmd[0] ;
         n10017AlbFmd = P0AJI2_n10017AlbFmd[0] ;
         A7101AlbLic = P0AJI2_A7101AlbLic[0] ;
         A5805AlbEnvFtp = P0AJI2_A5805AlbEnvFtp[0] ;
         AV13AlbFmd = A10017AlbFmd ;
         AV15calprd = (byte)(1) ;
         AV18DevCruAtId = A7101AlbLic ;
         AV19DevCruEnvAt = A5805AlbEnvFtp ;
         AV20Albprocodant = A30AlbProCod ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(AV13AlbFmd, " ") == 0 ) && ( AV15calprd == 1 ) )
      {
         AV9Msg_control = httpContext.getMessage( "Atenção! Não foi gerado o Hash da guia anterior(", "") + GXutil.trim( GXutil.str( AV20Albprocodant, 10, 0)) + ".)" + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Notar que não podem ser comunicadas guias à AT, quando existem guias anteriores sem Hash.", "") ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( AV19DevCruEnvAt == 0 ) && ( AV15calprd == 1 ) )
      {
         AV9Msg_control = httpContext.getMessage( "Atenção! O Guia anterior ", "") + GXutil.str( AV20Albprocodant, 10, 0) + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "NÃO foi enviado para a AT. Está PENDENTE.", "") + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Deve primeiro comunicar este documento à AT.", "") + GXutil.newLine( ) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ! (GXutil.strcmp("", AV13AlbFmd)==0) && ( AV15calprd == 1 ) )
      {
         if ( (GXutil.strcmp("", AV18DevCruAtId)==0) && (0==AV19DevCruEnvAt) )
         {
            AV9Msg_control = httpContext.getMessage( "Atenção! O Guia anterior ", "") + GXutil.str( AV20Albprocodant, 10, 0) + GXutil.newLine( ) ;
            AV9Msg_control += httpContext.getMessage( "Tem um código hash, mas não tem um código AT.", "") + GXutil.newLine( ) ;
            AV9Msg_control += httpContext.getMessage( "Deve primeiro comunicar este documento à AT.", "") + GXutil.newLine( ) ;
         }
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = pctrlhashanterior_2.this.AV9Msg_control;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Msg_control = "" ;
      GXv_int2 = new byte[1] ;
      AV10ddmmaaaa = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV11Fecha = GXutil.nullDate() ;
      AV12ContCod = "" ;
      GXv_int5 = new int[1] ;
      AV13AlbFmd = "" ;
      scmdbuf = "" ;
      P0AJI2_A396EmprCod = new String[] {""} ;
      P0AJI2_A30AlbProCod = new long[1] ;
      P0AJI2_A39AlbProPri = new String[] {""} ;
      P0AJI2_A10017AlbFmd = new String[] {""} ;
      P0AJI2_n10017AlbFmd = new boolean[] {false} ;
      P0AJI2_A7101AlbLic = new String[] {""} ;
      P0AJI2_A5805AlbEnvFtp = new byte[1] ;
      A39AlbProPri = "" ;
      A10017AlbFmd = "" ;
      A7101AlbLic = "" ;
      AV18DevCruAtId = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pctrlhashanterior_2__default(),
         new Object[] {
             new Object[] {
            P0AJI2_A396EmprCod, P0AJI2_A30AlbProCod, P0AJI2_A39AlbProPri, P0AJI2_A10017AlbFmd, P0AJI2_n10017AlbFmd, P0AJI2_A7101AlbLic, P0AJI2_A5805AlbEnvFtp
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Noaplicar ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV15calprd ;
   private byte A5805AlbEnvFtp ;
   private byte AV19DevCruEnvAt ;
   private short Gx_err ;
   private int AV14ContVal ;
   private int GXv_int5[] ;
   private long AV17AlbProcod ;
   private long A30AlbProCod ;
   private long AV20Albprocodant ;
   private String A396EmprCod ;
   private String AV8ALbProPri ;
   private String AV10ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV12ContCod ;
   private String scmdbuf ;
   private String A39AlbProPri ;
   private String A7101AlbLic ;
   private String AV18DevCruAtId ;
   private java.util.Date AV11Fecha ;
   private boolean returnInSub ;
   private boolean n10017AlbFmd ;
   private String AV9Msg_control ;
   private String AV13AlbFmd ;
   private String A10017AlbFmd ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJI2_A396EmprCod ;
   private long[] P0AJI2_A30AlbProCod ;
   private String[] P0AJI2_A39AlbProPri ;
   private String[] P0AJI2_A10017AlbFmd ;
   private boolean[] P0AJI2_n10017AlbFmd ;
   private String[] P0AJI2_A7101AlbLic ;
   private byte[] P0AJI2_A5805AlbEnvFtp ;
}

final  class pctrlhashanterior_2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJI2", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbProPri, AlbFmd, AlbLic, AlbEnvFtp FROM TXPCALPRD WHERE (EmprCod = ?) AND (AlbProPri = ?) AND (AlbProCod < ?) ORDER BY EmprCod, AlbProCod DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

