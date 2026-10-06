package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedafa extends GXProcedure
{
   public ppedafa( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedafa.class ), "" );
   }

   public ppedafa( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      ppedafa.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 ,
                             String[] aP4 )
   {
      ppedafa.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedafa.this.A11604PArtId = aP1[0];
      this.aP1 = aP1;
      ppedafa.this.AV11ProCod = aP2[0];
      this.aP2 = aP2;
      ppedafa.this.AV9CliCod = aP3[0];
      this.aP3 = aP3;
      ppedafa.this.AV8Unidad = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04M32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A11611PAFOrd = P04M32_A11611PAFOrd[0] ;
         System.out.println( httpContext.getMessage( "Eliminado Informacion PEDAFA ¡¡¡", "") );
         /* Using cursor P04M33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAFa");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P04M34 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV11ProCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A774ProNumLin = P04M34_A774ProNumLin[0] ;
         A457FasCod = P04M34_A457FasCod[0] ;
         A758ProCod = P04M34_A758ProCod[0] ;
         /*
            INSERT RECORD ON TABLE TXPPedAFa

         */
         GXt_int1 = (long)(DecimalUtil.decToDouble(A11600PAFDtoLis)) ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A11604PArtId ;
         GXv_char4[0] = A457FasCod ;
         GXv_int5[0] = (short)(0) ;
         GXv_char6[0] = httpContext.getMessage( "D", "") ;
         GXv_int7[0] = GXt_int1 ;
         new app.partpre(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_int5, GXv_char6, GXv_int7) ;
         ppedafa.this.A396EmprCod = GXv_char2[0] ;
         ppedafa.this.A11604PArtId = GXv_int3[0] ;
         ppedafa.this.A457FasCod = GXv_char4[0] ;
         ppedafa.this.GXt_int1 = GXv_int7[0] ;
         A11600PAFDtoLis = DecimalUtil.doubleToDec(GXt_int1) ;
         GXt_int1 = (long)(DecimalUtil.decToDouble(A11599PAFPreLis)) ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int3[0] = A11604PArtId ;
         GXv_char4[0] = A457FasCod ;
         GXv_int5[0] = (short)(0) ;
         GXv_char2[0] = httpContext.getMessage( "P", "") ;
         GXv_int7[0] = GXt_int1 ;
         new app.partpre(remoteHandle, context).execute( GXv_char6, GXv_int3, GXv_char4, GXv_int5, GXv_char2, GXv_int7) ;
         ppedafa.this.A396EmprCod = GXv_char6[0] ;
         ppedafa.this.A11604PArtId = GXv_int3[0] ;
         ppedafa.this.A457FasCod = GXv_char4[0] ;
         ppedafa.this.GXt_int1 = GXv_int7[0] ;
         A11599PAFPreLis = DecimalUtil.doubleToDec(GXt_int1) ;
         W457FasCod = A457FasCod ;
         A11611PAFOrd = A774ProNumLin ;
         A11592PAFPre = A11599PAFPreLis ;
         n11592PAFPre = false ;
         A11593PAFDto = A11600PAFDtoLis ;
         n11593PAFDto = false ;
         A11595PAFUni = AV8Unidad ;
         n11595PAFUni = false ;
         AV10ProNumLin = A774ProNumLin ;
         /* Using cursor P04M35 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId), Short.valueOf(A11611PAFOrd), A457FasCod, Boolean.valueOf(n11592PAFPre), A11592PAFPre, Boolean.valueOf(n11593PAFDto), A11593PAFDto, Boolean.valueOf(n11595PAFUni), A11595PAFUni});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAFa");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A457FasCod = W457FasCod ;
         /* End Insert */
         pr_default.readNext(2);
      }
      pr_default.close(2);
      /* Using cursor P04M36 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A11604PArtId)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A11559PAPUltFas = P04M36_A11559PAPUltFas[0] ;
         if ( A11559PAPUltFas < AV10ProNumLin )
         {
            A11559PAPUltFas = AV10ProNumLin ;
         }
         /* Using cursor P04M37 */
         pr_default.execute(5, new Object[] {Short.valueOf(A11559PAPUltFas), A396EmprCod, Integer.valueOf(A11604PArtId)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPedAEs");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedafa.this.A396EmprCod;
      this.aP1[0] = ppedafa.this.A11604PArtId;
      this.aP2[0] = ppedafa.this.AV11ProCod;
      this.aP3[0] = ppedafa.this.AV9CliCod;
      this.aP4[0] = ppedafa.this.AV8Unidad;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04M32_A396EmprCod = new String[] {""} ;
      P04M32_A11604PArtId = new int[1] ;
      P04M32_A11611PAFOrd = new short[1] ;
      P04M34_A396EmprCod = new String[] {""} ;
      P04M34_A774ProNumLin = new short[1] ;
      P04M34_A457FasCod = new String[] {""} ;
      P04M34_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A11600PAFDtoLis = DecimalUtil.ZERO ;
      A11599PAFPreLis = DecimalUtil.ZERO ;
      GXv_char6 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_int7 = new long[1] ;
      W457FasCod = "" ;
      A11592PAFPre = DecimalUtil.ZERO ;
      A11593PAFDto = DecimalUtil.ZERO ;
      A11595PAFUni = "" ;
      Gx_emsg = "" ;
      P04M36_A396EmprCod = new String[] {""} ;
      P04M36_A11604PArtId = new int[1] ;
      P04M36_A11559PAPUltFas = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedafa__default(),
         new Object[] {
             new Object[] {
            P04M32_A396EmprCod, P04M32_A11604PArtId, P04M32_A11611PAFOrd
            }
            , new Object[] {
            }
            , new Object[] {
            P04M34_A396EmprCod, P04M34_A774ProNumLin, P04M34_A457FasCod, P04M34_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04M36_A396EmprCod, P04M36_A11604PArtId, P04M36_A11559PAPUltFas
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A11611PAFOrd ;
   private short A774ProNumLin ;
   private short GXv_int5[] ;
   private short AV10ProNumLin ;
   private short Gx_err ;
   private short A11559PAPUltFas ;
   private int A11604PArtId ;
   private int AV9CliCod ;
   private int GX_INS1541 ;
   private int GXv_int3[] ;
   private long GXt_int1 ;
   private long GXv_int7[] ;
   private java.math.BigDecimal A11600PAFDtoLis ;
   private java.math.BigDecimal A11599PAFPreLis ;
   private java.math.BigDecimal A11592PAFPre ;
   private java.math.BigDecimal A11593PAFDto ;
   private String A396EmprCod ;
   private String AV11ProCod ;
   private String AV8Unidad ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String GXv_char6[] ;
   private String GXv_char4[] ;
   private String GXv_char2[] ;
   private String W457FasCod ;
   private String A11595PAFUni ;
   private String Gx_emsg ;
   private boolean n11592PAFPre ;
   private boolean n11593PAFDto ;
   private boolean n11595PAFUni ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private int[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04M32_A396EmprCod ;
   private int[] P04M32_A11604PArtId ;
   private short[] P04M32_A11611PAFOrd ;
   private String[] P04M34_A396EmprCod ;
   private short[] P04M34_A774ProNumLin ;
   private String[] P04M34_A457FasCod ;
   private String[] P04M34_A758ProCod ;
   private String[] P04M36_A396EmprCod ;
   private int[] P04M36_A11604PArtId ;
   private short[] P04M36_A11559PAPUltFas ;
}

final  class ppedafa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04M32", "SELECT EmprCod, PArtId, PAFOrd FROM TXPPedAFa WHERE EmprCod = ? and PArtId = ? ORDER BY EmprCod, PArtId, PAFOrd ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04M33", "DELETE FROM TXPPedAFa  WHERE EmprCod = ? AND PArtId = ? AND PAFOrd = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAFa")
         ,new ForEachCursor("P04M34", "SELECT EmprCod, ProNumLin, FasCod, ProCod FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod, ProNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04M35", "INSERT INTO TXPPedAFa(EmprCod, PArtId, PAFOrd, FasCod, PAFPre, PAFDto, PAFUni, PAFRec, PAFAut) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAFa")
         ,new ForEachCursor("P04M36", "SELECT EmprCod, PArtId, PAPUltFas FROM TXPPedAEs WHERE EmprCod = ? and PArtId = ? ORDER BY EmprCod, PArtId ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04M37", "UPDATE TXPPedAEs SET PAPUltFas=?  WHERE EmprCod = ? AND PArtId = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPedAEs")
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 1);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

