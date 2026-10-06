package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pforacaf extends GXProcedure
{
   public pforacaf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pforacaf.class ), "" );
   }

   public pforacaf( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pforacaf.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pforacaf.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pforacaf.this.AV11BarCod = aP1[0];
      this.aP1 = aP1;
      pforacaf.this.AV12barCodReo = aP2[0];
      this.aP2 = aP2;
      pforacaf.this.AV13Barcodpar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14ARTPROCOD = " " ;
      /* Using cursor P02JC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11BarCod), Byte.valueOf(AV12barCodReo), AV13Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P02JC2_A130BarCodPar[0] ;
         A132BarCodReo = P02JC2_A132BarCodReo[0] ;
         A129BarCod = P02JC2_A129BarCod[0] ;
         A118BarAcaQui = P02JC2_A118BarAcaQui[0] ;
         /* Using cursor P02JC3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A150BarFacTin = P02JC3_A150BarFacTin[0] ;
            A4905BarFasAcab = P02JC3_A4905BarFasAcab[0] ;
            A4287BarFasFor = P02JC3_A4287BarFasFor[0] ;
            A764ProForCod = P02JC3_A764ProForCod[0] ;
            A5371FasQuiLin = P02JC3_A5371FasQuiLin[0] ;
            A194BarOrdLin = P02JC3_A194BarOrdLin[0] ;
            A758ProCod = P02JC3_A758ProCod[0] ;
            A150BarFacTin = P02JC3_A150BarFacTin[0] ;
            A4905BarFasAcab = P02JC3_A4905BarFasAcab[0] ;
            A4287BarFasFor = P02JC3_A4287BarFasFor[0] ;
            if ( ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) != 0 ) )
            {
               AV14ARTPROCOD = A764ProForCod ;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A118BarAcaQui = AV14ARTPROCOD ;
         /* Using cursor P02JC4 */
         pr_default.execute(2, new Object[] {A118BarAcaQui, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pforacaf.this.A396EmprCod;
      this.aP1[0] = pforacaf.this.AV11BarCod;
      this.aP2[0] = pforacaf.this.AV12barCodReo;
      this.aP3[0] = pforacaf.this.AV13Barcodpar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pforacaf");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14ARTPROCOD = "" ;
      scmdbuf = "" ;
      P02JC2_A396EmprCod = new String[] {""} ;
      P02JC2_A130BarCodPar = new String[] {""} ;
      P02JC2_A132BarCodReo = new byte[1] ;
      P02JC2_A129BarCod = new int[1] ;
      P02JC2_A118BarAcaQui = new String[] {""} ;
      A130BarCodPar = "" ;
      A118BarAcaQui = "" ;
      P02JC3_A396EmprCod = new String[] {""} ;
      P02JC3_A129BarCod = new int[1] ;
      P02JC3_A132BarCodReo = new byte[1] ;
      P02JC3_A130BarCodPar = new String[] {""} ;
      P02JC3_A150BarFacTin = new String[] {""} ;
      P02JC3_A4905BarFasAcab = new String[] {""} ;
      P02JC3_A4287BarFasFor = new String[] {""} ;
      P02JC3_A764ProForCod = new String[] {""} ;
      P02JC3_A5371FasQuiLin = new short[1] ;
      P02JC3_A194BarOrdLin = new short[1] ;
      P02JC3_A758ProCod = new String[] {""} ;
      A150BarFacTin = "" ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A764ProForCod = "" ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pforacaf__default(),
         new Object[] {
             new Object[] {
            P02JC2_A396EmprCod, P02JC2_A130BarCodPar, P02JC2_A132BarCodReo, P02JC2_A129BarCod, P02JC2_A118BarAcaQui
            }
            , new Object[] {
            P02JC3_A396EmprCod, P02JC3_A129BarCod, P02JC3_A132BarCodReo, P02JC3_A130BarCodPar, P02JC3_A150BarFacTin, P02JC3_A4905BarFasAcab, P02JC3_A4287BarFasFor, P02JC3_A764ProForCod, P02JC3_A5371FasQuiLin, P02JC3_A194BarOrdLin,
            P02JC3_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12barCodReo ;
   private byte A132BarCodReo ;
   private short A5371FasQuiLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int AV11BarCod ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV13Barcodpar ;
   private String AV14ARTPROCOD ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A118BarAcaQui ;
   private String A150BarFacTin ;
   private String A4905BarFasAcab ;
   private String A4287BarFasFor ;
   private String A764ProForCod ;
   private String A758ProCod ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02JC2_A396EmprCod ;
   private String[] P02JC2_A130BarCodPar ;
   private byte[] P02JC2_A132BarCodReo ;
   private int[] P02JC2_A129BarCod ;
   private String[] P02JC2_A118BarAcaQui ;
   private String[] P02JC3_A396EmprCod ;
   private int[] P02JC3_A129BarCod ;
   private byte[] P02JC3_A132BarCodReo ;
   private String[] P02JC3_A130BarCodPar ;
   private String[] P02JC3_A150BarFacTin ;
   private String[] P02JC3_A4905BarFasAcab ;
   private String[] P02JC3_A4287BarFasFor ;
   private String[] P02JC3_A764ProForCod ;
   private short[] P02JC3_A5371FasQuiLin ;
   private short[] P02JC3_A194BarOrdLin ;
   private String[] P02JC3_A758ProCod ;
}

final  class pforacaf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02JC2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarAcaQui FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02JC3", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarFacTin, T2.BarFasAcab, T2.BarFasFor, T1.ProForCod, T1.FasQuiLin, T1.BarOrdLin, T1.ProCod FROM (TXPFASQUI T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin, T1.FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02JC4", "UPDATE TXPBARCAD SET BarAcaQui=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

