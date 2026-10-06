package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfestan3 extends GXProcedure
{
   public pfestan3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfestan3.class ), "" );
   }

   public pfestan3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      pfestan3.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      pfestan3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfestan3.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfestan3.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfestan3.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfestan3.this.AV10BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pfestan3.this.AV8Abierta = aP5[0];
      this.aP5 = aP5;
      pfestan3.this.AV11FasAnt = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV12Texfina ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXFNA", ""), GXv_int2) ;
      pfestan3.this.GXt_int1 = GXv_int2[0] ;
      AV12Texfina = GXt_int1 ;
      GXt_int1 = AV9FasOpc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FASOPC", ""), GXv_int2) ;
      pfestan3.this.GXt_int1 = GXv_int2[0] ;
      AV9FasOpc = GXt_int1 ;
      AV15GXLvl6 = (byte)(0) ;
      /* Using cursor P02S52 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV10BarOrdLin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = P02S52_A153BarFasEst[0] ;
         A152BarFasCon = P02S52_A152BarFasCon[0] ;
         A194BarOrdLin = P02S52_A194BarOrdLin[0] ;
         A7105FasObl = P02S52_A7105FasObl[0] ;
         n7105FasObl = P02S52_n7105FasObl[0] ;
         A457FasCod = P02S52_A457FasCod[0] ;
         A758ProCod = P02S52_A758ProCod[0] ;
         A7105FasObl = P02S52_A7105FasObl[0] ;
         n7105FasObl = P02S52_n7105FasObl[0] ;
         if ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 )
         {
            AV15GXLvl6 = (byte)(1) ;
            if ( ( A153BarFasEst == 0 ) && ( GXutil.strcmp(A7105FasObl, httpContext.getMessage( "N", "")) == 0 ) && ( ( AV12Texfina == 1 ) || ( AV9FasOpc == 1 ) ) )
            {
               AV11FasAnt = httpContext.getMessage( "Ninguna", "") ;
               AV8Abierta = httpContext.getMessage( "N", "") ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV11FasAnt = A457FasCod ;
            AV8Abierta = httpContext.getMessage( "S", "") ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV15GXLvl6 == 0 )
      {
         AV11FasAnt = httpContext.getMessage( "Ninguna", "") ;
         AV8Abierta = httpContext.getMessage( "N", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfestan3.this.A396EmprCod;
      this.aP1[0] = pfestan3.this.A129BarCod;
      this.aP2[0] = pfestan3.this.A132BarCodReo;
      this.aP3[0] = pfestan3.this.A130BarCodPar;
      this.aP4[0] = pfestan3.this.AV10BarOrdLin;
      this.aP5[0] = pfestan3.this.AV8Abierta;
      this.aP6[0] = pfestan3.this.AV11FasAnt;
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
      P02S52_A396EmprCod = new String[] {""} ;
      P02S52_A129BarCod = new int[1] ;
      P02S52_A132BarCodReo = new byte[1] ;
      P02S52_A130BarCodPar = new String[] {""} ;
      P02S52_A153BarFasEst = new byte[1] ;
      P02S52_A152BarFasCon = new String[] {""} ;
      P02S52_A194BarOrdLin = new short[1] ;
      P02S52_A7105FasObl = new String[] {""} ;
      P02S52_n7105FasObl = new boolean[] {false} ;
      P02S52_A457FasCod = new String[] {""} ;
      P02S52_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      A7105FasObl = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfestan3__default(),
         new Object[] {
             new Object[] {
            P02S52_A396EmprCod, P02S52_A129BarCod, P02S52_A132BarCodReo, P02S52_A130BarCodPar, P02S52_A153BarFasEst, P02S52_A152BarFasCon, P02S52_A194BarOrdLin, P02S52_A7105FasObl, P02S52_n7105FasObl, P02S52_A457FasCod,
            P02S52_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV12Texfina ;
   private byte AV9FasOpc ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV15GXLvl6 ;
   private byte A153BarFasEst ;
   private short AV10BarOrdLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Abierta ;
   private String AV11FasAnt ;
   private String scmdbuf ;
   private String A152BarFasCon ;
   private String A7105FasObl ;
   private String A457FasCod ;
   private String A758ProCod ;
   private boolean n7105FasObl ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02S52_A396EmprCod ;
   private int[] P02S52_A129BarCod ;
   private byte[] P02S52_A132BarCodReo ;
   private String[] P02S52_A130BarCodPar ;
   private byte[] P02S52_A153BarFasEst ;
   private String[] P02S52_A152BarFasCon ;
   private short[] P02S52_A194BarOrdLin ;
   private String[] P02S52_A7105FasObl ;
   private boolean[] P02S52_n7105FasObl ;
   private String[] P02S52_A457FasCod ;
   private String[] P02S52_A758ProCod ;
}

final  class pfestan3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02S52", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarFasEst, T1.BarFasCon, T1.BarOrdLin, T2.FasObl, T1.FasCod, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarOrdLin < ?) AND (T1.BarFasEst <> 2) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

