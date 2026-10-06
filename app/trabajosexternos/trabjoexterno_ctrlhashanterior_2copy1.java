package app.trabajosexternos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class trabjoexterno_ctrlhashanterior_2copy1 extends GXProcedure
{
   public trabjoexterno_ctrlhashanterior_2copy1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabjoexterno_ctrlhashanterior_2copy1.class ), "" );
   }

   public trabjoexterno_ctrlhashanterior_2copy1( int remoteHandle ,
                                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      trabjoexterno_ctrlhashanterior_2copy1.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      trabjoexterno_ctrlhashanterior_2copy1.this.AV21EmprCod = aP0;
      trabjoexterno_ctrlhashanterior_2copy1.this.AV23SalExtAlb = aP1;
      trabjoexterno_ctrlhashanterior_2copy1.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV16Noaplicar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "NOHAAN", ""), GXv_int2) ;
      trabjoexterno_ctrlhashanterior_2copy1.this.GXt_int1 = GXv_int2[0] ;
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
      new app.core.pbusdsc2(remoteHandle, context).execute( AV21EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_char4) ;
      trabjoexterno_ctrlhashanterior_2copy1.this.GXt_char3 = GXv_char4[0] ;
      AV10ddmmaaaa = GXt_char3 ;
      AV10ddmmaaaa = ((GXutil.strcmp(AV10ddmmaaaa, " ")==0) ? "02/04/12" : AV10ddmmaaaa) ;
      AV11Fecha = localUtil.ctod( AV10ddmmaaaa, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      AV13AlbFmd = " " ;
      AV15calprd = (byte)(0) ;
      AV18DevCruAtId = "" ;
      AV19DevCruEnvAt = (byte)(0) ;
      /* Using cursor P0AJW2 */
      pr_default.execute(0, new Object[] {AV21EmprCod, Integer.valueOf(AV23SalExtAlb)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AJW2_A396EmprCod[0] ;
         A2253SalExtAlb = P0AJW2_A2253SalExtAlb[0] ;
         A10077SalFmd = P0AJW2_A10077SalFmd[0] ;
         A10742SalCodeID = P0AJW2_A10742SalCodeID[0] ;
         A10741SalEnvAT = P0AJW2_A10741SalEnvAT[0] ;
         AV13AlbFmd = A10077SalFmd ;
         AV18DevCruAtId = A10742SalCodeID ;
         AV19DevCruEnvAt = A10741SalEnvAT ;
         AV22DevCruIdant = A2253SalExtAlb ;
         AV15calprd = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ( GXutil.strcmp(AV13AlbFmd, " ") == 0 ) && ( AV15calprd == 1 ) )
      {
         AV9Msg_control = httpContext.getMessage( "Atenção! Não foi gerado o Hash da guia anterior(", "") + GXutil.trim( GXutil.str( AV22DevCruIdant, 8, 0)) + ".)" + GXutil.newLine( ) ;
         AV9Msg_control += httpContext.getMessage( "Notar que não podem ser comunicadas guias à AT, quando existem guias anteriores sem Hash.", "") ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( AV19DevCruEnvAt == 0 ) && ( AV15calprd == 1 ) )
      {
         AV9Msg_control = httpContext.getMessage( "Atenção! O Guia anterior ", "") + GXutil.str( AV22DevCruIdant, 8, 0) + GXutil.newLine( ) ;
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
            AV9Msg_control = httpContext.getMessage( "Atenção! O Guia anterior ", "") + GXutil.str( AV22DevCruIdant, 8, 0) + GXutil.newLine( ) ;
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
      this.aP2[0] = trabjoexterno_ctrlhashanterior_2copy1.this.AV9Msg_control;
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
      AV13AlbFmd = "" ;
      AV18DevCruAtId = "" ;
      scmdbuf = "" ;
      P0AJW2_A396EmprCod = new String[] {""} ;
      P0AJW2_A2253SalExtAlb = new int[1] ;
      P0AJW2_A10077SalFmd = new String[] {""} ;
      P0AJW2_A10742SalCodeID = new String[] {""} ;
      P0AJW2_A10741SalEnvAT = new byte[1] ;
      A396EmprCod = "" ;
      A10077SalFmd = "" ;
      A10742SalCodeID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabjoexterno_ctrlhashanterior_2copy1__default(),
         new Object[] {
             new Object[] {
            P0AJW2_A396EmprCod, P0AJW2_A2253SalExtAlb, P0AJW2_A10077SalFmd, P0AJW2_A10742SalCodeID, P0AJW2_A10741SalEnvAT
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
   private byte AV19DevCruEnvAt ;
   private byte A10741SalEnvAT ;
   private short Gx_err ;
   private int AV23SalExtAlb ;
   private int A2253SalExtAlb ;
   private int AV22DevCruIdant ;
   private String AV21EmprCod ;
   private String AV10ddmmaaaa ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV18DevCruAtId ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A10077SalFmd ;
   private String A10742SalCodeID ;
   private java.util.Date AV11Fecha ;
   private boolean returnInSub ;
   private String AV9Msg_control ;
   private String AV13AlbFmd ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AJW2_A396EmprCod ;
   private int[] P0AJW2_A2253SalExtAlb ;
   private String[] P0AJW2_A10077SalFmd ;
   private String[] P0AJW2_A10742SalCodeID ;
   private byte[] P0AJW2_A10741SalEnvAT ;
}

final  class trabjoexterno_ctrlhashanterior_2copy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AJW2", "SELECT * FROM (SELECT EmprCod, SalExtAlb, SalFmd, SalCodeID, SalEnvAT FROM TXPCEXTSA WHERE EmprCod = ? and SalExtAlb < ? ORDER BY EmprCod, SalExtAlb DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 200);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

