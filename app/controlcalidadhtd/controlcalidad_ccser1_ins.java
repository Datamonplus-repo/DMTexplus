package app.controlcalidadhtd ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class controlcalidad_ccser1_ins extends GXProcedure
{
   public controlcalidad_ccser1_ins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccser1_ins.class ), "" );
   }

   public controlcalidad_ccser1_ins( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        int aP5 ,
                        int aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             int aP5 ,
                             int aP6 )
   {
      controlcalidad_ccser1_ins.this.AV10emprcod = aP0;
      controlcalidad_ccser1_ins.this.AV14clicod = aP1;
      controlcalidad_ccser1_ins.this.AV11CliNom = aP2;
      controlcalidad_ccser1_ins.this.AV12Artcod = aP3;
      controlcalidad_ccser1_ins.this.AV13CCFColNom = aP4;
      controlcalidad_ccser1_ins.this.AV8CCFColNum = aP5;
      controlcalidad_ccser1_ins.this.AV9Cctcod = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPCCSer1

      */
      A396EmprCod = AV10emprcod ;
      A252CliCod = AV14clicod ;
      A65ArtCod = AV12Artcod ;
      A4058CCFColNom = AV13CCFColNom ;
      A4059CCFColNum = AV8CCFColNum ;
      A4031CCTCod = AV9Cctcod ;
      /* Using cursor P0AOL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSer1");
      if ( (pr_default.getStatus(0) == 1) )
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
      /* Using cursor P0AOL3 */
      pr_default.execute(1, new Object[] {AV10emprcod, Integer.valueOf(AV9Cctcod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A13249CCVNorma = P0AOL3_A13249CCVNorma[0] ;
         A14345CCVEspe2 = P0AOL3_A14345CCVEspe2[0] ;
         A4034CCTLin = P0AOL3_A4034CCTLin[0] ;
         A4031CCTCod = P0AOL3_A4031CCTCod[0] ;
         A396EmprCod = P0AOL3_A396EmprCod[0] ;
         W396EmprCod = A396EmprCod ;
         W4031CCTCod = A4031CCTCod ;
         /*
            INSERT RECORD ON TABLE TXPCCSta

         */
         W396EmprCod = A396EmprCod ;
         W4031CCTCod = A4031CCTCod ;
         W4034CCTLin = A4034CCTLin ;
         A396EmprCod = AV10emprcod ;
         A252CliCod = AV14clicod ;
         A65ArtCod = AV12Artcod ;
         A4058CCFColNom = AV13CCFColNom ;
         A4059CCFColNum = AV8CCFColNum ;
         A4031CCTCod = AV9Cctcod ;
         A4060CCSVal = "" ;
         n4060CCSVal = false ;
         A11482CCSMin = "" ;
         n11482CCSMin = false ;
         A11483CCSMax = "" ;
         n11483CCSMax = false ;
         A11530CCSAuto = (byte)(0) ;
         A11531CCSVCod = "" ;
         A11532CCSVTol = DecimalUtil.ZERO ;
         A13247CCSMetodo = A13249CCVNorma ;
         n13247CCSMetodo = false ;
         A13248CCSEspecif = GXutil.substring( A14345CCVEspe2, 1, 30) ;
         n13248CCSEspecif = false ;
         /* Using cursor P0AOL4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4058CCFColNom, Integer.valueOf(A4059CCFColNum), Integer.valueOf(A4031CCTCod), Short.valueOf(A4034CCTLin), Boolean.valueOf(n4060CCSVal), A4060CCSVal, Boolean.valueOf(n11482CCSMin), A11482CCSMin, Boolean.valueOf(n11483CCSMax), A11483CCSMax, Byte.valueOf(A11530CCSAuto), A11531CCSVCod, A11532CCSVTol, Boolean.valueOf(n13247CCSMetodo), A13247CCSMetodo, Boolean.valueOf(n13248CCSEspecif), A13248CCSEspecif});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCSta");
         if ( (pr_default.getStatus(2) == 1) )
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
         A4031CCTCod = W4031CCTCod ;
         A4034CCTLin = W4034CCTLin ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A4031CCTCod = W4031CCTCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccser1_ins");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A4058CCFColNom = "" ;
      Gx_emsg = "" ;
      scmdbuf = "" ;
      P0AOL3_A13249CCVNorma = new String[] {""} ;
      P0AOL3_A14345CCVEspe2 = new String[] {""} ;
      P0AOL3_A4034CCTLin = new short[1] ;
      P0AOL3_A4031CCTCod = new int[1] ;
      P0AOL3_A396EmprCod = new String[] {""} ;
      A13249CCVNorma = "" ;
      A14345CCVEspe2 = "" ;
      W396EmprCod = "" ;
      A4060CCSVal = "" ;
      A11482CCSMin = "" ;
      A11483CCSMax = "" ;
      A11531CCSVCod = "" ;
      A11532CCSVTol = DecimalUtil.ZERO ;
      A13247CCSMetodo = "" ;
      A13248CCSEspecif = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccser1_ins__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            P0AOL3_A13249CCVNorma, P0AOL3_A14345CCVEspe2, P0AOL3_A4034CCTLin, P0AOL3_A4031CCTCod, P0AOL3_A396EmprCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11530CCSAuto ;
   private short Gx_err ;
   private short A4034CCTLin ;
   private short W4034CCTLin ;
   private int AV14clicod ;
   private int AV8CCFColNum ;
   private int AV9Cctcod ;
   private int GX_INS628 ;
   private int A252CliCod ;
   private int A4059CCFColNum ;
   private int A4031CCTCod ;
   private int W4031CCTCod ;
   private int GX_INS629 ;
   private java.math.BigDecimal A11532CCSVTol ;
   private String AV10emprcod ;
   private String AV11CliNom ;
   private String AV12Artcod ;
   private String AV13CCFColNom ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A4058CCFColNom ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String A13249CCVNorma ;
   private String W396EmprCod ;
   private String A4060CCSVal ;
   private String A11482CCSMin ;
   private String A11483CCSMax ;
   private String A11531CCSVCod ;
   private String A13247CCSMetodo ;
   private String A13248CCSEspecif ;
   private boolean n4060CCSVal ;
   private boolean n11482CCSMin ;
   private boolean n11483CCSMax ;
   private boolean n13247CCSMetodo ;
   private boolean n13248CCSEspecif ;
   private String A14345CCVEspe2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AOL3_A13249CCVNorma ;
   private String[] P0AOL3_A14345CCVEspe2 ;
   private short[] P0AOL3_A4034CCTLin ;
   private int[] P0AOL3_A4031CCTCod ;
   private String[] P0AOL3_A396EmprCod ;
}

final  class controlcalidad_ccser1_ins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0AOL2", "INSERT INTO TXPCCSer1(EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSer1")
         ,new ForEachCursor("P0AOL3", "SELECT CCVNorma, CCVEspe2, CCTLin, CCTCod, EmprCod FROM TXPCCDef1 WHERE EmprCod = ? and CCTCod = ? ORDER BY EmprCod, CCTCod, CCTLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P0AOL4", "INSERT INTO TXPCCSta(EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod, CCTLin, CCSVal, CCSMin, CCSMax, CCSAuto, CCSVCod, CCSVTol, CCSMetodo, CCSEspecif) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCCSta")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 40);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[10], 40);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[12], 40);
               }
               stmt.setByte(11, ((Number) parms[13]).byteValue());
               stmt.setString(12, (String)parms[14], 10);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[15], 2);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[17], 30);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[19], 30);
               }
               return;
      }
   }

}

