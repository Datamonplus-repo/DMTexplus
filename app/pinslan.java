package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pinslan extends GXProcedure
{
   public pinslan( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pinslan.class ), "" );
   }

   public pinslan( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pinslan.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pinslan.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pinslan.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pinslan.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pinslan.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pinslan.this.AV15Linea = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV16Termin ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pinslan.this.GXt_char1 = GXv_char2[0] ;
      AV16Termin = GXt_char1 ;
      /* Using cursor P004F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A236BarVolMaq = P004F2_A236BarVolMaq[0] ;
         W396EmprCod = A396EmprCod ;
         AV15Linea = (short)(AV15Linea+1) ;
         /*
            INSERT RECORD ON TABLE TXPBARLAN

         */
         W396EmprCod = A396EmprCod ;
         A1438BarTerCod = AV16Termin ;
         A172BarLanLin = AV15Linea ;
         A171BarLanCod = A129BarCod ;
         n171BarLanCod = false ;
         A175BarLanReo = A132BarCodReo ;
         n175BarLanReo = false ;
         A174BarLanPar = A130BarCodPar ;
         n174BarLanPar = false ;
         A173BarLanMaq = ">>" ;
         n173BarLanMaq = false ;
         A176BarLanVol = A236BarVolMaq ;
         n176BarLanVol = false ;
         /* Using cursor P004F3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A1438BarTerCod, Short.valueOf(A172BarLanLin), Boolean.valueOf(n171BarLanCod), Integer.valueOf(A171BarLanCod), Boolean.valueOf(n175BarLanReo), Byte.valueOf(A175BarLanReo), Boolean.valueOf(n174BarLanPar), A174BarLanPar, Boolean.valueOf(n173BarLanMaq), A173BarLanMaq, Boolean.valueOf(n176BarLanVol), Integer.valueOf(A176BarLanVol)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARLAN");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV15Linea = (short)(AV15Linea+1) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pinslan.this.A396EmprCod;
      this.aP1[0] = pinslan.this.A129BarCod;
      this.aP2[0] = pinslan.this.A132BarCodReo;
      this.aP3[0] = pinslan.this.A130BarCodPar;
      this.aP4[0] = pinslan.this.AV15Linea;
      Application.commitDataStores(context, remoteHandle, pr_default, "pinslan");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16Termin = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      scmdbuf = "" ;
      P004F2_A396EmprCod = new String[] {""} ;
      P004F2_A129BarCod = new int[1] ;
      P004F2_A132BarCodReo = new byte[1] ;
      P004F2_A130BarCodPar = new String[] {""} ;
      P004F2_A236BarVolMaq = new int[1] ;
      W396EmprCod = "" ;
      A1438BarTerCod = "" ;
      A174BarLanPar = "" ;
      A173BarLanMaq = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pinslan__default(),
         new Object[] {
             new Object[] {
            P004F2_A396EmprCod, P004F2_A129BarCod, P004F2_A132BarCodReo, P004F2_A130BarCodPar, P004F2_A236BarVolMaq
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A175BarLanReo ;
   private short AV15Linea ;
   private short A172BarLanLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A236BarVolMaq ;
   private int GX_INS205 ;
   private int A171BarLanCod ;
   private int A176BarLanVol ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV16Termin ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String W396EmprCod ;
   private String A1438BarTerCod ;
   private String A174BarLanPar ;
   private String A173BarLanMaq ;
   private String Gx_emsg ;
   private boolean n171BarLanCod ;
   private boolean n175BarLanReo ;
   private boolean n174BarLanPar ;
   private boolean n173BarLanMaq ;
   private boolean n176BarLanVol ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P004F2_A396EmprCod ;
   private int[] P004F2_A129BarCod ;
   private byte[] P004F2_A132BarCodReo ;
   private String[] P004F2_A130BarCodPar ;
   private int[] P004F2_A236BarVolMaq ;
}

final  class pinslan__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004F2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarVolMaq FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P004F3", "INSERT INTO TXPBARLAN(EmprCod, BarTerCod, BarLanLin, BarLanCod, BarLanReo, BarLanPar, BarLanMaq, BarLanVol) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARLAN")
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
               ((int[]) buf[4])[0] = rslt.getInt(5);
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 6);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[12]).intValue());
               }
               return;
      }
   }

}

