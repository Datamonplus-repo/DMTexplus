package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppreser extends GXProcedure
{
   public ppreser( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppreser.class ), "" );
   }

   public ppreser( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 ,
                          String[] aP3 ,
                          java.math.BigDecimal[] aP4 ,
                          java.math.BigDecimal[] aP5 ,
                          int[] aP6 ,
                          int[] aP7 ,
                          String[] aP8 )
   {
      ppreser.this.aP9 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        int[] aP6 ,
                        int[] aP7 ,
                        String[] aP8 ,
                        int[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             int[] aP6 ,
                             int[] aP7 ,
                             String[] aP8 ,
                             int[] aP9 )
   {
      ppreser.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppreser.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      ppreser.this.A457FasCod = aP2[0];
      this.aP2 = aP2;
      ppreser.this.AV10FasDsc = aP3[0];
      this.aP3 = aP3;
      ppreser.this.AV8FasPreKgm = aP4[0];
      this.aP4 = aP4;
      ppreser.this.AV9FasPreMtr = aP5[0];
      this.aP5 = aP5;
      ppreser.this.AV14pml = aP6[0];
      this.aP6 = aP6;
      ppreser.this.AV13ValPml = aP7[0];
      this.aP7 = aP7;
      ppreser.this.AV11BarAcc = aP8[0];
      this.aP8 = aP8;
      ppreser.this.AV12Pml500 = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV16PmlCliente ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PMLCLI", ""), GXv_int2) ;
      ppreser.this.GXt_int1 = GXv_int2[0] ;
      AV16PmlCliente = GXt_int1 ;
      /* Using cursor P01322 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A457FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A467FasPreMtr = P01322_A467FasPreMtr[0] ;
         n467FasPreMtr = P01322_n467FasPreMtr[0] ;
         A466FasPreKgm = P01322_A466FasPreKgm[0] ;
         n466FasPreKgm = P01322_n466FasPreKgm[0] ;
         A460FasDsc = P01322_A460FasDsc[0] ;
         A5648CliTipo = P01322_A5648CliTipo[0] ;
         A13291CliFacFm = P01322_A13291CliFacFm[0] ;
         A13292CliFacFmt = P01322_A13292CliFacFmt[0] ;
         A4903FasAcab = P01322_A4903FasAcab[0] ;
         n4903FasAcab = P01322_n4903FasAcab[0] ;
         A12577FasPreKgF = P01322_A12577FasPreKgF[0] ;
         n12577FasPreKgF = P01322_n12577FasPreKgF[0] ;
         A12576FasPreMt2 = P01322_A12576FasPreMt2[0] ;
         n12576FasPreMt2 = P01322_n12576FasPreMt2[0] ;
         A5648CliTipo = P01322_A5648CliTipo[0] ;
         A13291CliFacFm = P01322_A13291CliFacFm[0] ;
         A13292CliFacFmt = P01322_A13292CliFacFmt[0] ;
         A460FasDsc = P01322_A460FasDsc[0] ;
         A4903FasAcab = P01322_A4903FasAcab[0] ;
         n4903FasAcab = P01322_n4903FasAcab[0] ;
         AV9FasPreMtr = A467FasPreMtr ;
         AV8FasPreKgm = A466FasPreKgm ;
         AV10FasDsc = A460FasDsc ;
         AV15CliTipo = A5648CliTipo ;
         AV17CliFacFm = A13291CliFacFm ;
         AV18CliFacFmt = A13292CliFacFmt ;
         if ( GXutil.strcmp(AV11BarAcc, httpContext.getMessage( "N", "")) == 0 )
         {
            if ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( GXutil.strcmp(A12577FasPreKgF, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV8FasPreKgm = A466FasPreKgm ;
                  AV9FasPreMtr = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  if ( ( AV14pml <= AV13ValPml ) && ( AV13ValPml > 0 ) && ( AV14pml > 0 ) )
                  {
                     AV8FasPreKgm = DecimalUtil.doubleToDec(0) ;
                     AV9FasPreMtr = A467FasPreMtr ;
                  }
                  else
                  {
                     if ( ( ( AV16PmlCliente == 0 ) && ( AV14pml >= AV12Pml500 ) && ( AV12Pml500 > 0 ) && ( AV14pml > 0 ) && ( GXutil.strcmp(AV15CliTipo, httpContext.getMessage( "I", "")) == 0 ) ) || ( ( AV16PmlCliente == 1 ) && ( AV14pml >= AV18CliFacFmt ) && ( AV18CliFacFmt > 0 ) && ( AV14pml > 0 ) && ( GXutil.strcmp(AV17CliFacFm, httpContext.getMessage( "S", "")) == 0 ) ) )
                     {
                        AV8FasPreKgm = DecimalUtil.doubleToDec(0) ;
                        AV9FasPreMtr = A12576FasPreMt2 ;
                     }
                     else
                     {
                        AV8FasPreKgm = A466FasPreKgm ;
                        AV9FasPreMtr = DecimalUtil.doubleToDec(0) ;
                     }
                  }
               }
            }
            else
            {
               AV8FasPreKgm = A466FasPreKgm ;
               AV9FasPreMtr = DecimalUtil.doubleToDec(0) ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppreser.this.A396EmprCod;
      this.aP1[0] = ppreser.this.A252CliCod;
      this.aP2[0] = ppreser.this.A457FasCod;
      this.aP3[0] = ppreser.this.AV10FasDsc;
      this.aP4[0] = ppreser.this.AV8FasPreKgm;
      this.aP5[0] = ppreser.this.AV9FasPreMtr;
      this.aP6[0] = ppreser.this.AV14pml;
      this.aP7[0] = ppreser.this.AV13ValPml;
      this.aP8[0] = ppreser.this.AV11BarAcc;
      this.aP9[0] = ppreser.this.AV12Pml500;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P01322_A396EmprCod = new String[] {""} ;
      P01322_A252CliCod = new int[1] ;
      P01322_A457FasCod = new String[] {""} ;
      P01322_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01322_n467FasPreMtr = new boolean[] {false} ;
      P01322_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01322_n466FasPreKgm = new boolean[] {false} ;
      P01322_A460FasDsc = new String[] {""} ;
      P01322_A5648CliTipo = new String[] {""} ;
      P01322_A13291CliFacFm = new String[] {""} ;
      P01322_A13292CliFacFmt = new short[1] ;
      P01322_A4903FasAcab = new String[] {""} ;
      P01322_n4903FasAcab = new boolean[] {false} ;
      P01322_A12577FasPreKgF = new String[] {""} ;
      P01322_n12577FasPreKgF = new boolean[] {false} ;
      P01322_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01322_n12576FasPreMt2 = new boolean[] {false} ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      A5648CliTipo = "" ;
      A13291CliFacFm = "" ;
      A4903FasAcab = "" ;
      A12577FasPreKgF = "" ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      AV15CliTipo = "" ;
      AV17CliFacFm = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppreser__default(),
         new Object[] {
             new Object[] {
            P01322_A396EmprCod, P01322_A252CliCod, P01322_A457FasCod, P01322_A467FasPreMtr, P01322_n467FasPreMtr, P01322_A466FasPreKgm, P01322_n466FasPreKgm, P01322_A460FasDsc, P01322_A5648CliTipo, P01322_A13291CliFacFm,
            P01322_A13292CliFacFmt, P01322_A4903FasAcab, P01322_n4903FasAcab, P01322_A12577FasPreKgF, P01322_n12577FasPreKgF, P01322_A12576FasPreMt2, P01322_n12576FasPreMt2
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16PmlCliente ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short A13292CliFacFmt ;
   private short AV18CliFacFmt ;
   private short Gx_err ;
   private int A252CliCod ;
   private int AV14pml ;
   private int AV13ValPml ;
   private int AV12Pml500 ;
   private java.math.BigDecimal AV8FasPreKgm ;
   private java.math.BigDecimal AV9FasPreMtr ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String AV10FasDsc ;
   private String AV11BarAcc ;
   private String scmdbuf ;
   private String A460FasDsc ;
   private String A5648CliTipo ;
   private String A13291CliFacFm ;
   private String A4903FasAcab ;
   private String A12577FasPreKgF ;
   private String AV15CliTipo ;
   private String AV17CliFacFm ;
   private boolean n467FasPreMtr ;
   private boolean n466FasPreKgm ;
   private boolean n4903FasAcab ;
   private boolean n12577FasPreKgF ;
   private boolean n12576FasPreMt2 ;
   private int[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private int[] aP6 ;
   private int[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P01322_A396EmprCod ;
   private int[] P01322_A252CliCod ;
   private String[] P01322_A457FasCod ;
   private java.math.BigDecimal[] P01322_A467FasPreMtr ;
   private boolean[] P01322_n467FasPreMtr ;
   private java.math.BigDecimal[] P01322_A466FasPreKgm ;
   private boolean[] P01322_n466FasPreKgm ;
   private String[] P01322_A460FasDsc ;
   private String[] P01322_A5648CliTipo ;
   private String[] P01322_A13291CliFacFm ;
   private short[] P01322_A13292CliFacFmt ;
   private String[] P01322_A4903FasAcab ;
   private boolean[] P01322_n4903FasAcab ;
   private String[] P01322_A12577FasPreKgF ;
   private boolean[] P01322_n12577FasPreKgF ;
   private java.math.BigDecimal[] P01322_A12576FasPreMt2 ;
   private boolean[] P01322_n12576FasPreMt2 ;
}

final  class ppreser__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01322", "SELECT T1.EmprCod, T1.CliCod, T1.FasCod, T1.FasPreMtr, T1.FasPreKgm, T3.FasDsc, T2.CliTipo, T2.CliFacFm, T2.CliFacFmt, T3.FasAcab, T1.FasPreKgF, T1.FasPreMt2 FROM ((TXPPREFAS T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 28);
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

