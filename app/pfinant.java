package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfinant extends GXProcedure
{
   public pfinant( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfinant.class ), "" );
   }

   public pfinant( int remoteHandle ,
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
      pfinant.this.aP6 = new String[] {""};
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
      pfinant.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfinant.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pfinant.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pfinant.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pfinant.this.AV9BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pfinant.this.AV8Abierta = aP5[0];
      this.aP5 = aP5;
      pfinant.this.AV10CodFasAnt = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV11FasOpc ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FASOPC", ""), GXv_int2) ;
      pfinant.this.GXt_int1 = GXv_int2[0] ;
      AV11FasOpc = GXt_int1 ;
      AV10CodFasAnt = " " ;
      AV8Abierta = " " ;
      if ( AV11FasOpc == 0 )
      {
         /* Using cursor P00T62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV9BarOrdLin)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A194BarOrdLin = P00T62_A194BarOrdLin[0] ;
            A152BarFasCon = P00T62_A152BarFasCon[0] ;
            A153BarFasEst = P00T62_A153BarFasEst[0] ;
            A457FasCod = P00T62_A457FasCod[0] ;
            A758ProCod = P00T62_A758ProCod[0] ;
            if ( ( A153BarFasEst != 2 ) && ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 ) )
            {
               AV8Abierta = httpContext.getMessage( "S", "") ;
               AV10CodFasAnt = A457FasCod ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(0);
         }
         pr_default.close(0);
      }
      else
      {
         /* Using cursor P00T63 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(AV9BarOrdLin)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A7105FasObl = P00T63_A7105FasObl[0] ;
            n7105FasObl = P00T63_n7105FasObl[0] ;
            A152BarFasCon = P00T63_A152BarFasCon[0] ;
            A153BarFasEst = P00T63_A153BarFasEst[0] ;
            A194BarOrdLin = P00T63_A194BarOrdLin[0] ;
            A457FasCod = P00T63_A457FasCod[0] ;
            A758ProCod = P00T63_A758ProCod[0] ;
            A7105FasObl = P00T63_A7105FasObl[0] ;
            n7105FasObl = P00T63_n7105FasObl[0] ;
            if ( ( GXutil.strcmp(A152BarFasCon, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A7105FasObl, httpContext.getMessage( "S", "")) == 0 ) )
            {
               AV8Abierta = httpContext.getMessage( "S", "") ;
               AV10CodFasAnt = A457FasCod ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfinant.this.A396EmprCod;
      this.aP1[0] = pfinant.this.A129BarCod;
      this.aP2[0] = pfinant.this.A132BarCodReo;
      this.aP3[0] = pfinant.this.A130BarCodPar;
      this.aP4[0] = pfinant.this.AV9BarOrdLin;
      this.aP5[0] = pfinant.this.AV8Abierta;
      this.aP6[0] = pfinant.this.AV10CodFasAnt;
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
      P00T62_A396EmprCod = new String[] {""} ;
      P00T62_A129BarCod = new int[1] ;
      P00T62_A132BarCodReo = new byte[1] ;
      P00T62_A130BarCodPar = new String[] {""} ;
      P00T62_A194BarOrdLin = new short[1] ;
      P00T62_A152BarFasCon = new String[] {""} ;
      P00T62_A153BarFasEst = new byte[1] ;
      P00T62_A457FasCod = new String[] {""} ;
      P00T62_A758ProCod = new String[] {""} ;
      A152BarFasCon = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      P00T63_A396EmprCod = new String[] {""} ;
      P00T63_A129BarCod = new int[1] ;
      P00T63_A132BarCodReo = new byte[1] ;
      P00T63_A130BarCodPar = new String[] {""} ;
      P00T63_A7105FasObl = new String[] {""} ;
      P00T63_n7105FasObl = new boolean[] {false} ;
      P00T63_A152BarFasCon = new String[] {""} ;
      P00T63_A153BarFasEst = new byte[1] ;
      P00T63_A194BarOrdLin = new short[1] ;
      P00T63_A457FasCod = new String[] {""} ;
      P00T63_A758ProCod = new String[] {""} ;
      A7105FasObl = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfinant__default(),
         new Object[] {
             new Object[] {
            P00T62_A396EmprCod, P00T62_A129BarCod, P00T62_A132BarCodReo, P00T62_A130BarCodPar, P00T62_A194BarOrdLin, P00T62_A152BarFasCon, P00T62_A153BarFasEst, P00T62_A457FasCod, P00T62_A758ProCod
            }
            , new Object[] {
            P00T63_A396EmprCod, P00T63_A129BarCod, P00T63_A132BarCodReo, P00T63_A130BarCodPar, P00T63_A7105FasObl, P00T63_n7105FasObl, P00T63_A152BarFasCon, P00T63_A153BarFasEst, P00T63_A194BarOrdLin, P00T63_A457FasCod,
            P00T63_A758ProCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV11FasOpc ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A153BarFasEst ;
   private short AV9BarOrdLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV8Abierta ;
   private String AV10CodFasAnt ;
   private String scmdbuf ;
   private String A152BarFasCon ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A7105FasObl ;
   private boolean n7105FasObl ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00T62_A396EmprCod ;
   private int[] P00T62_A129BarCod ;
   private byte[] P00T62_A132BarCodReo ;
   private String[] P00T62_A130BarCodPar ;
   private short[] P00T62_A194BarOrdLin ;
   private String[] P00T62_A152BarFasCon ;
   private byte[] P00T62_A153BarFasEst ;
   private String[] P00T62_A457FasCod ;
   private String[] P00T62_A758ProCod ;
   private String[] P00T63_A396EmprCod ;
   private int[] P00T63_A129BarCod ;
   private byte[] P00T63_A132BarCodReo ;
   private String[] P00T63_A130BarCodPar ;
   private String[] P00T63_A7105FasObl ;
   private boolean[] P00T63_n7105FasObl ;
   private String[] P00T63_A152BarFasCon ;
   private byte[] P00T63_A153BarFasEst ;
   private short[] P00T63_A194BarOrdLin ;
   private String[] P00T63_A457FasCod ;
   private String[] P00T63_A758ProCod ;
}

final  class pfinant__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00T62", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasCon, BarFasEst, FasCod, ProCod FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin < ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00T63", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.FasObl, T1.BarFasCon, T1.BarFasEst, T1.BarOrdLin, T1.FasCod, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?) AND (T1.BarOrdLin < ?) AND (T1.BarFasEst <> 2) ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

