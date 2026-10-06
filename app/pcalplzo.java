package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalplzo extends GXProcedure
{
   public pcalplzo( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalplzo.class ), "" );
   }

   public pcalplzo( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 ,
                                     int[] aP1 ,
                                     String[] aP2 ,
                                     String[] aP3 ,
                                     String[] aP4 ,
                                     byte[] aP5 ,
                                     short[] aP6 ,
                                     int[] aP7 )
   {
      pcalplzo.this.aP8 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 ,
                        short[] aP6 ,
                        int[] aP7 ,
                        java.util.Date[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 ,
                             short[] aP6 ,
                             int[] aP7 ,
                             java.util.Date[] aP8 )
   {
      pcalplzo.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalplzo.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcalplzo.this.A7552ACUTipo = aP2[0];
      this.aP2 = aP2;
      pcalplzo.this.AV17DisCliNum = aP3[0];
      this.aP3 = aP3;
      pcalplzo.this.A65ArtCod = aP4[0];
      this.aP4 = aP4;
      pcalplzo.this.AV19DesCol = aP5[0];
      this.aP5 = aP5;
      pcalplzo.this.AV20DiasLabo = aP6[0];
      this.aP6 = aP6;
      pcalplzo.this.AV25discod = aP7[0];
      this.aP7 = aP7;
      pcalplzo.this.AV16Fecha = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV27EmprNom ;
      GXv_char3[0] = AV28UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char1, GXv_char2, GXv_char3) ;
      pcalplzo.this.A396EmprCod = GXv_char1[0] ;
      pcalplzo.this.AV27EmprNom = GXv_char2[0] ;
      pcalplzo.this.AV28UsurCod = GXv_char3[0] ;
      AV23Inc_obs = " " ;
      AV16Fecha = GXutil.dadd(GXutil.today( ),-(10)) ;
      AV24FecDia = GXutil.today( ) ;
      /* Using cursor P02XQ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A829TipArtCod = P02XQ2_A829TipArtCod[0] ;
         A7376TipArtDias = P02XQ2_A7376TipArtDias[0] ;
         n7376TipArtDias = P02XQ2_n7376TipArtDias[0] ;
         A3121ArtNumCor = P02XQ2_A3121ArtNumCor[0] ;
         n3121ArtNumCor = P02XQ2_n3121ArtNumCor[0] ;
         A7376TipArtDias = P02XQ2_A7376TipArtDias[0] ;
         n7376TipArtDias = P02XQ2_n7376TipArtDias[0] ;
         AV18DiasAdic = (short)(A3121ArtNumCor+A7376TipArtDias) ;
         AV23Inc_obs = httpContext.getMessage( "Dias Adic,Articulo = ", "") + GXutil.trim( GXutil.str( A3121ArtNumCor, 4, 0)) + GXutil.chr( (short)(13)) ;
         AV23Inc_obs += httpContext.getMessage( "Dias TArticulo     = ", "") + GXutil.trim( GXutil.str( A7376TipArtDias, 3, 0)) + GXutil.chr( (short)(13)) ;
         AV23Inc_obs += httpContext.getMessage( "Dias Total         = ", "") + GXutil.trim( GXutil.str( AV18DiasAdic, 3, 0)) + GXutil.chr( (short)(13)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV19DesCol == 1 )
      {
         AV18DiasAdic = (short)(AV18DiasAdic+AV20DiasLabo) ;
         AV23Inc_obs += httpContext.getMessage( "Dias Lab    = ", "") + GXutil.trim( GXutil.str( AV20DiasLabo, 3, 0)) + GXutil.chr( (short)(13)) ;
         AV23Inc_obs += httpContext.getMessage( "Dias Total  = ", "") + GXutil.trim( GXutil.str( AV18DiasAdic, 3, 0)) + GXutil.chr( (short)(13)) ;
      }
      /* Using cursor P02XQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A306CliUrg = P02XQ3_A306CliUrg[0] ;
         /* Using cursor P02XQ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A306CliUrg), A7552ACUTipo});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A7500ACUPlzo = P02XQ4_A7500ACUPlzo[0] ;
            n7500ACUPlzo = P02XQ4_n7500ACUPlzo[0] ;
            /* Using cursor P02XQ5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Byte.valueOf(A306CliUrg), A7552ACUTipo, AV17DisCliNum});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A7673LACUDisCli = P02XQ5_A7673LACUDisCli[0] ;
               n7673LACUDisCli = P02XQ5_n7673LACUDisCli[0] ;
               A7674LACUPlzo = P02XQ5_A7674LACUPlzo[0] ;
               n7674LACUPlzo = P02XQ5_n7674LACUPlzo[0] ;
               A7672LACULin = P02XQ5_A7672LACULin[0] ;
               AV16Fecha = GXutil.dadd(GXutil.dadd(GXutil.today( ),+((int)(A7674LACUPlzo))),+((int)(AV18DiasAdic))) ;
               AV23Inc_obs += httpContext.getMessage( "Disp Cli= ", "") + GXutil.trim( AV17DisCliNum) + GXutil.chr( (short)(13)) ;
               AV23Inc_obs += httpContext.getMessage( "Plazo   = ", "") + GXutil.trim( GXutil.str( A7674LACUPlzo, 3, 0)) + GXutil.chr( (short)(13)) ;
               AV23Inc_obs += httpContext.getMessage( "Fecha Cal = ", "") + localUtil.dtoc( AV16Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
               pr_default.readNext(3);
            }
            pr_default.close(3);
            if ( ! (0==A7500ACUPlzo) && GXutil.resetTime(AV16Fecha).before( GXutil.resetTime( GXutil.today( ) )) )
            {
               AV23Inc_obs += httpContext.getMessage( "Plazo Dias= ", "") + GXutil.trim( GXutil.str( A7500ACUPlzo, 3, 0)) + GXutil.chr( (short)(13)) ;
               AV23Inc_obs += httpContext.getMessage( "Fecha Cal ", "") + localUtil.dtoc( AV16Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + httpContext.getMessage( " menor Fecha Dia= ", "") + localUtil.dtoc( AV24FecDia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
               AV16Fecha = GXutil.dadd(GXutil.dadd(GXutil.today( ),+((int)(A7500ACUPlzo))),+((int)(AV18DiasAdic))) ;
               AV23Inc_obs += httpContext.getMessage( "Fecha Cal= ", "") + localUtil.dtoc( AV16Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV21Fecha1 = AV16Fecha ;
      GXv_char3[0] = A396EmprCod ;
      GXv_date4[0] = AV21Fecha1 ;
      GXv_int5[0] = (short)(0) ;
      GXv_date6[0] = AV22Fecha2 ;
      new app.pfpddt(remoteHandle, context).execute( GXv_char3, GXv_date4, GXv_int5, GXv_date6) ;
      pcalplzo.this.A396EmprCod = GXv_char3[0] ;
      pcalplzo.this.AV21Fecha1 = GXv_date4[0] ;
      pcalplzo.this.AV22Fecha2 = GXv_date6[0] ;
      AV16Fecha = AV22Fecha2 ;
      AV23Inc_obs += httpContext.getMessage( "Fecha Cal Calendario= ", "") + localUtil.dtoc( AV16Fecha, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.chr( (short)(13)) ;
      if ( AV25discod > 0 )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV35Pgmname, AV28UsurCod, AV26Station, AV23Inc_obs, AV25discod, (byte)(0), "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalplzo.this.A396EmprCod;
      this.aP1[0] = pcalplzo.this.A252CliCod;
      this.aP2[0] = pcalplzo.this.A7552ACUTipo;
      this.aP3[0] = pcalplzo.this.AV17DisCliNum;
      this.aP4[0] = pcalplzo.this.A65ArtCod;
      this.aP5[0] = pcalplzo.this.AV19DesCol;
      this.aP6[0] = pcalplzo.this.AV20DiasLabo;
      this.aP7[0] = pcalplzo.this.AV25discod;
      this.aP8[0] = pcalplzo.this.AV16Fecha;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV26Station = "" ;
      GXv_char1 = new String[1] ;
      AV27EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV28UsurCod = "" ;
      AV23Inc_obs = "" ;
      AV24FecDia = GXutil.nullDate() ;
      scmdbuf = "" ;
      P02XQ2_A829TipArtCod = new short[1] ;
      P02XQ2_A396EmprCod = new String[] {""} ;
      P02XQ2_A252CliCod = new int[1] ;
      P02XQ2_A65ArtCod = new String[] {""} ;
      P02XQ2_A7376TipArtDias = new short[1] ;
      P02XQ2_n7376TipArtDias = new boolean[] {false} ;
      P02XQ2_A3121ArtNumCor = new short[1] ;
      P02XQ2_n3121ArtNumCor = new boolean[] {false} ;
      P02XQ3_A396EmprCod = new String[] {""} ;
      P02XQ3_A252CliCod = new int[1] ;
      P02XQ3_A306CliUrg = new byte[1] ;
      P02XQ4_A396EmprCod = new String[] {""} ;
      P02XQ4_A306CliUrg = new byte[1] ;
      P02XQ4_A7552ACUTipo = new String[] {""} ;
      P02XQ4_A7500ACUPlzo = new short[1] ;
      P02XQ4_n7500ACUPlzo = new boolean[] {false} ;
      P02XQ5_A396EmprCod = new String[] {""} ;
      P02XQ5_A306CliUrg = new byte[1] ;
      P02XQ5_A7552ACUTipo = new String[] {""} ;
      P02XQ5_A7673LACUDisCli = new String[] {""} ;
      P02XQ5_n7673LACUDisCli = new boolean[] {false} ;
      P02XQ5_A7674LACUPlzo = new short[1] ;
      P02XQ5_n7674LACUPlzo = new boolean[] {false} ;
      P02XQ5_A7672LACULin = new int[1] ;
      A7673LACUDisCli = "" ;
      AV21Fecha1 = GXutil.nullDate() ;
      GXv_char3 = new String[1] ;
      GXv_date4 = new java.util.Date[1] ;
      GXv_int5 = new short[1] ;
      AV22Fecha2 = GXutil.nullDate() ;
      GXv_date6 = new java.util.Date[1] ;
      AV35Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalplzo__default(),
         new Object[] {
             new Object[] {
            P02XQ2_A829TipArtCod, P02XQ2_A396EmprCod, P02XQ2_A252CliCod, P02XQ2_A65ArtCod, P02XQ2_A7376TipArtDias, P02XQ2_n7376TipArtDias, P02XQ2_A3121ArtNumCor, P02XQ2_n3121ArtNumCor
            }
            , new Object[] {
            P02XQ3_A396EmprCod, P02XQ3_A252CliCod, P02XQ3_A306CliUrg
            }
            , new Object[] {
            P02XQ4_A396EmprCod, P02XQ4_A306CliUrg, P02XQ4_A7552ACUTipo, P02XQ4_A7500ACUPlzo, P02XQ4_n7500ACUPlzo
            }
            , new Object[] {
            P02XQ5_A396EmprCod, P02XQ5_A306CliUrg, P02XQ5_A7552ACUTipo, P02XQ5_A7673LACUDisCli, P02XQ5_n7673LACUDisCli, P02XQ5_A7674LACUPlzo, P02XQ5_n7674LACUPlzo, P02XQ5_A7672LACULin
            }
         }
      );
      AV35Pgmname = "PCALPLZO" ;
      /* GeneXus formulas. */
      AV35Pgmname = "PCALPLZO" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19DesCol ;
   private byte A306CliUrg ;
   private short AV20DiasLabo ;
   private short A829TipArtCod ;
   private short A7376TipArtDias ;
   private short A3121ArtNumCor ;
   private short AV18DiasAdic ;
   private short A7500ACUPlzo ;
   private short A7674LACUPlzo ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV25discod ;
   private int A7672LACULin ;
   private String A396EmprCod ;
   private String A7552ACUTipo ;
   private String AV17DisCliNum ;
   private String A65ArtCod ;
   private String AV26Station ;
   private String GXv_char1[] ;
   private String AV27EmprNom ;
   private String GXv_char2[] ;
   private String AV28UsurCod ;
   private String scmdbuf ;
   private String A7673LACUDisCli ;
   private String GXv_char3[] ;
   private String AV35Pgmname ;
   private java.util.Date AV16Fecha ;
   private java.util.Date AV24FecDia ;
   private java.util.Date AV21Fecha1 ;
   private java.util.Date GXv_date4[] ;
   private java.util.Date AV22Fecha2 ;
   private java.util.Date GXv_date6[] ;
   private boolean n7376TipArtDias ;
   private boolean n3121ArtNumCor ;
   private boolean n7500ACUPlzo ;
   private boolean n7673LACUDisCli ;
   private boolean n7674LACUPlzo ;
   private String AV23Inc_obs ;
   private java.util.Date[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private byte[] aP5 ;
   private short[] aP6 ;
   private int[] aP7 ;
   private IDataStoreProvider pr_default ;
   private short[] P02XQ2_A829TipArtCod ;
   private String[] P02XQ2_A396EmprCod ;
   private int[] P02XQ2_A252CliCod ;
   private String[] P02XQ2_A65ArtCod ;
   private short[] P02XQ2_A7376TipArtDias ;
   private boolean[] P02XQ2_n7376TipArtDias ;
   private short[] P02XQ2_A3121ArtNumCor ;
   private boolean[] P02XQ2_n3121ArtNumCor ;
   private String[] P02XQ3_A396EmprCod ;
   private int[] P02XQ3_A252CliCod ;
   private byte[] P02XQ3_A306CliUrg ;
   private String[] P02XQ4_A396EmprCod ;
   private byte[] P02XQ4_A306CliUrg ;
   private String[] P02XQ4_A7552ACUTipo ;
   private short[] P02XQ4_A7500ACUPlzo ;
   private boolean[] P02XQ4_n7500ACUPlzo ;
   private String[] P02XQ5_A396EmprCod ;
   private byte[] P02XQ5_A306CliUrg ;
   private String[] P02XQ5_A7552ACUTipo ;
   private String[] P02XQ5_A7673LACUDisCli ;
   private boolean[] P02XQ5_n7673LACUDisCli ;
   private short[] P02XQ5_A7674LACUPlzo ;
   private boolean[] P02XQ5_n7674LACUPlzo ;
   private int[] P02XQ5_A7672LACULin ;
}

final  class pcalplzo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02XQ2", "SELECT T1.TipArtCod, T1.EmprCod, T1.CliCod, T1.ArtCod, T2.TipArtDias, T1.ArtNumCor FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XQ3", "SELECT EmprCod, CliCod, CliUrg FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XQ4", "SELECT EmprCod, CliUrg, ACUTipo, ACUPlzo FROM TXPACLIUR WHERE EmprCod = ? and CliUrg = ? and ACUTipo = ? ORDER BY EmprCod, CliUrg, ACUTipo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02XQ5", "SELECT EmprCod, CliUrg, ACUTipo, LACUDisCli, LACUPlzo, LACULin FROM TXPACLIU1 WHERE (EmprCod = ? and CliUrg = ? and ACUTipo = ?) AND (LACUDisCli = ?) ORDER BY EmprCod, CliUrg, ACUTipo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
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
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 8);
               return;
      }
   }

}

