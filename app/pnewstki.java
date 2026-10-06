package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewstki extends GXProcedure
{
   public pnewstki( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewstki.class ), "" );
   }

   public pnewstki( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 )
   {
      pnewstki.this.aP3 = new String[] {""};
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
      pnewstki.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewstki.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pnewstki.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      pnewstki.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P021V2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P021V2_A130BarCodPar[0] ;
         A132BarCodReo = P021V2_A132BarCodReo[0] ;
         A129BarCod = P021V2_A129BarCod[0] ;
         A200BarPieCod = P021V2_A200BarPieCod[0] ;
         A44AlbRecCod = P021V2_A44AlbRecCod[0] ;
         A203BarPieKil = P021V2_A203BarPieKil[0] ;
         A205BarPieMet = P021V2_A205BarPieMet[0] ;
         A1501BarPiePie = P021V2_A1501BarPiePie[0] ;
         /* Using cursor P021V3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A146BarEst = P021V3_A146BarEst[0] ;
         AV11BarPieCod = A200BarPieCod ;
         AV12AlbRecCod = A44AlbRecCod ;
         AV13BarPieKil = A203BarPieKil ;
         AV14BarPieMet = A205BarPieMet ;
         AV15BarPiePie = A1501BarPiePie ;
         A146BarEst = (byte)(1) ;
         /* Using cursor P021V4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A146BarEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      /*
         INSERT RECORD ON TABLE TXPDISREF

      */
      /* Using cursor P021V5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      A966PartCod = P021V5_A966PartCod[0] ;
      n966PartCod = P021V5_n966PartCod[0] ;
      A252CliCod = P021V5_A252CliCod[0] ;
      pr_default.close(3);
      /* Using cursor P021V6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n966PartCod), A966PartCod, Integer.valueOf(A252CliCod)});
      A2747PartOpe = P021V6_A2747PartOpe[0] ;
      n2747PartOpe = P021V6_n2747PartOpe[0] ;
      pr_default.close(4);
      A361DisCod = (int)(GXutil.lval( A2747PartOpe)) ;
      A3398DisRefBarC = AV8BarCod ;
      A3399DisRefBCRe = AV9BarCodReo ;
      A3400DisRefBCPa = AV10BarCodPar ;
      A3607DisRefBPie = AV11BarPieCod ;
      A3608DisRefAlbR = AV12AlbRecCod ;
      n3608DisRefAlbR = false ;
      A3401DisRefKgs = AV13BarPieKil ;
      n3401DisRefKgs = false ;
      A3402DisRefMts = AV14BarPieMet ;
      n3402DisRefMts = false ;
      A3403DisRefPie = (short)(AV15BarPiePie) ;
      n3403DisRefPie = false ;
      /* Using cursor P021V7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(A3398DisRefBarC), Byte.valueOf(A3399DisRefBCRe), A3400DisRefBCPa, A3607DisRefBPie, Boolean.valueOf(n3608DisRefAlbR), Integer.valueOf(A3608DisRefAlbR), Boolean.valueOf(n3401DisRefKgs), A3401DisRefKgs, Boolean.valueOf(n3402DisRefMts), A3402DisRefMts, Boolean.valueOf(n3403DisRefPie), Short.valueOf(A3403DisRefPie)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISREF");
      if ( (pr_default.getStatus(5) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewstki.this.A396EmprCod;
      this.aP1[0] = pnewstki.this.AV8BarCod;
      this.aP2[0] = pnewstki.this.AV9BarCodReo;
      this.aP3[0] = pnewstki.this.AV10BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewstki");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P021V2_A396EmprCod = new String[] {""} ;
      P021V2_A130BarCodPar = new String[] {""} ;
      P021V2_A132BarCodReo = new byte[1] ;
      P021V2_A129BarCod = new int[1] ;
      P021V2_A200BarPieCod = new String[] {""} ;
      P021V2_A44AlbRecCod = new int[1] ;
      P021V2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P021V2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P021V2_A1501BarPiePie = new int[1] ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      P021V3_A146BarEst = new byte[1] ;
      AV11BarPieCod = "" ;
      AV13BarPieKil = DecimalUtil.ZERO ;
      AV14BarPieMet = DecimalUtil.ZERO ;
      P021V5_A966PartCod = new String[] {""} ;
      P021V5_n966PartCod = new boolean[] {false} ;
      P021V5_A252CliCod = new int[1] ;
      A966PartCod = "" ;
      P021V6_A2747PartOpe = new String[] {""} ;
      P021V6_n2747PartOpe = new boolean[] {false} ;
      A2747PartOpe = "" ;
      A3400DisRefBCPa = "" ;
      A3607DisRefBPie = "" ;
      A3401DisRefKgs = DecimalUtil.ZERO ;
      A3402DisRefMts = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewstki__default(),
         new Object[] {
             new Object[] {
            P021V2_A396EmprCod, P021V2_A130BarCodPar, P021V2_A132BarCodReo, P021V2_A129BarCod, P021V2_A200BarPieCod, P021V2_A44AlbRecCod, P021V2_A203BarPieKil, P021V2_A205BarPieMet, P021V2_A1501BarPiePie
            }
            , new Object[] {
            P021V3_A146BarEst
            }
            , new Object[] {
            }
            , new Object[] {
            P021V5_A966PartCod, P021V5_n966PartCod, P021V5_A252CliCod
            }
            , new Object[] {
            P021V6_A2747PartOpe, P021V6_n2747PartOpe
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte A132BarCodReo ;
   private byte A146BarEst ;
   private byte A3399DisRefBCRe ;
   private short A3403DisRefPie ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int A44AlbRecCod ;
   private int A1501BarPiePie ;
   private int AV12AlbRecCod ;
   private int AV15BarPiePie ;
   private int GX_INS503 ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A3398DisRefBarC ;
   private int A3608DisRefAlbR ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV13BarPieKil ;
   private java.math.BigDecimal AV14BarPieMet ;
   private java.math.BigDecimal A3401DisRefKgs ;
   private java.math.BigDecimal A3402DisRefMts ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String AV11BarPieCod ;
   private String A966PartCod ;
   private String A2747PartOpe ;
   private String A3400DisRefBCPa ;
   private String A3607DisRefBPie ;
   private String Gx_emsg ;
   private boolean n966PartCod ;
   private boolean n2747PartOpe ;
   private boolean n3608DisRefAlbR ;
   private boolean n3401DisRefKgs ;
   private boolean n3402DisRefMts ;
   private boolean n3403DisRefPie ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P021V2_A396EmprCod ;
   private String[] P021V2_A130BarCodPar ;
   private byte[] P021V2_A132BarCodReo ;
   private int[] P021V2_A129BarCod ;
   private String[] P021V2_A200BarPieCod ;
   private int[] P021V2_A44AlbRecCod ;
   private java.math.BigDecimal[] P021V2_A203BarPieKil ;
   private java.math.BigDecimal[] P021V2_A205BarPieMet ;
   private int[] P021V2_A1501BarPiePie ;
   private byte[] P021V3_A146BarEst ;
   private String[] P021V5_A966PartCod ;
   private boolean[] P021V5_n966PartCod ;
   private int[] P021V5_A252CliCod ;
   private String[] P021V6_A2747PartOpe ;
   private boolean[] P021V6_n2747PartOpe ;
}

final  class pnewstki__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P021V2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarPieCod, AlbRecCod, BarPieKil, BarPieMet, BarPiePie FROM TXPBARPIE WHERE (EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P021V3", "SELECT BarEst FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P021V4", "UPDATE TXPBARCAD SET BarEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P021V5", "SELECT PartCod, CliCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P021V6", "SELECT PartOpe FROM TXPCPARTI WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P021V7", "INSERT INTO TXPDISREF(EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie, DisRefAlbR, DisRefKgs, DisRefMts, DisRefPie, DisRefPzII) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISREF")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[13]).shortValue());
               }
               return;
      }
   }

}

