package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psipasta extends GXProcedure
{
   public psipasta( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psipasta.class ), "" );
   }

   public psipasta( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      psipasta.this.aP7 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      psipasta.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psipasta.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      psipasta.this.A2141SerEst = aP2[0];
      this.aP2 = aP2;
      psipasta.this.A1013DibCli = aP3[0];
      this.aP3 = aP3;
      psipasta.this.A1014DibInt = aP4[0];
      this.aP4 = aP4;
      psipasta.this.A2074ColCom = aP5[0];
      this.aP5 = aP5;
      psipasta.this.A2078ColFon = aP6[0];
      this.aP6 = aP6;
      psipasta.this.Gx_msg = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = " " ;
      /* Using cursor P03PH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      while ( (pr_default.getStatus(0) != 101) )
      {
         AV12Mfores = (byte)(0) ;
         /* Using cursor P03PH3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A2098MolCod = P03PH3_A2098MolCod[0] ;
            A2100MolCon = P03PH3_A2100MolCon[0] ;
            n2100MolCon = P03PH3_n2100MolCon[0] ;
            AV12Mfores = (byte)(1) ;
            AV13Molcod = A2098MolCod ;
            AV11Pasfor = (byte)(0) ;
            /* Using cursor P03PH4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A2654PasForLin = P03PH4_A2654PasForLin[0] ;
               AV11Pasfor = (byte)(1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
            if ( AV11Pasfor == 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( ( AV12Mfores == 1 ) && ( AV11Pasfor == 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Atencion NO hay PASTA en el Cilindro ", "") + GXutil.str( AV13Molcod, 2, 0) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psipasta.this.A396EmprCod;
      this.aP1[0] = psipasta.this.A252CliCod;
      this.aP2[0] = psipasta.this.A2141SerEst;
      this.aP3[0] = psipasta.this.A1013DibCli;
      this.aP4[0] = psipasta.this.A1014DibInt;
      this.aP5[0] = psipasta.this.A2074ColCom;
      this.aP6[0] = psipasta.this.A2078ColFon;
      this.aP7[0] = psipasta.this.Gx_msg;
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
      P03PH2_A396EmprCod = new String[] {""} ;
      P03PH2_A252CliCod = new int[1] ;
      P03PH2_A2141SerEst = new String[] {""} ;
      P03PH2_A1013DibCli = new String[] {""} ;
      P03PH2_A1014DibInt = new int[1] ;
      P03PH2_A2074ColCom = new String[] {""} ;
      P03PH2_A2078ColFon = new String[] {""} ;
      P03PH3_A396EmprCod = new String[] {""} ;
      P03PH3_A252CliCod = new int[1] ;
      P03PH3_A2141SerEst = new String[] {""} ;
      P03PH3_A1013DibCli = new String[] {""} ;
      P03PH3_A1014DibInt = new int[1] ;
      P03PH3_A2074ColCom = new String[] {""} ;
      P03PH3_A2078ColFon = new String[] {""} ;
      P03PH3_A2098MolCod = new byte[1] ;
      P03PH3_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03PH3_n2100MolCon = new boolean[] {false} ;
      A2100MolCon = DecimalUtil.ZERO ;
      P03PH4_A396EmprCod = new String[] {""} ;
      P03PH4_A252CliCod = new int[1] ;
      P03PH4_A2141SerEst = new String[] {""} ;
      P03PH4_A1013DibCli = new String[] {""} ;
      P03PH4_A1014DibInt = new int[1] ;
      P03PH4_A2074ColCom = new String[] {""} ;
      P03PH4_A2078ColFon = new String[] {""} ;
      P03PH4_A2098MolCod = new byte[1] ;
      P03PH4_A2654PasForLin = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psipasta__default(),
         new Object[] {
             new Object[] {
            P03PH2_A396EmprCod, P03PH2_A252CliCod, P03PH2_A2141SerEst, P03PH2_A1013DibCli, P03PH2_A1014DibInt, P03PH2_A2074ColCom, P03PH2_A2078ColFon
            }
            , new Object[] {
            P03PH3_A396EmprCod, P03PH3_A252CliCod, P03PH3_A2141SerEst, P03PH3_A1013DibCli, P03PH3_A1014DibInt, P03PH3_A2074ColCom, P03PH3_A2078ColFon, P03PH3_A2098MolCod, P03PH3_A2100MolCon, P03PH3_n2100MolCon
            }
            , new Object[] {
            P03PH4_A396EmprCod, P03PH4_A252CliCod, P03PH4_A2141SerEst, P03PH4_A1013DibCli, P03PH4_A1014DibInt, P03PH4_A2074ColCom, P03PH4_A2078ColFon, P03PH4_A2098MolCod, P03PH4_A2654PasForLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12Mfores ;
   private byte A2098MolCod ;
   private byte AV13Molcod ;
   private byte AV11Pasfor ;
   private short A2654PasForLin ;
   private short Gx_err ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private java.math.BigDecimal A2100MolCon ;
   private String A396EmprCod ;
   private String A2141SerEst ;
   private String A1013DibCli ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String Gx_msg ;
   private String scmdbuf ;
   private boolean n2100MolCon ;
   private String[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P03PH2_A396EmprCod ;
   private int[] P03PH2_A252CliCod ;
   private String[] P03PH2_A2141SerEst ;
   private String[] P03PH2_A1013DibCli ;
   private int[] P03PH2_A1014DibInt ;
   private String[] P03PH2_A2074ColCom ;
   private String[] P03PH2_A2078ColFon ;
   private String[] P03PH3_A396EmprCod ;
   private int[] P03PH3_A252CliCod ;
   private String[] P03PH3_A2141SerEst ;
   private String[] P03PH3_A1013DibCli ;
   private int[] P03PH3_A1014DibInt ;
   private String[] P03PH3_A2074ColCom ;
   private String[] P03PH3_A2078ColFon ;
   private byte[] P03PH3_A2098MolCod ;
   private java.math.BigDecimal[] P03PH3_A2100MolCon ;
   private boolean[] P03PH3_n2100MolCon ;
   private String[] P03PH4_A396EmprCod ;
   private int[] P03PH4_A252CliCod ;
   private String[] P03PH4_A2141SerEst ;
   private String[] P03PH4_A1013DibCli ;
   private int[] P03PH4_A1014DibInt ;
   private String[] P03PH4_A2074ColCom ;
   private String[] P03PH4_A2078ColFon ;
   private byte[] P03PH4_A2098MolCod ;
   private short[] P03PH4_A2654PasForLin ;
}

final  class psipasta__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03PH2", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P03PH3", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, MolCon FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03PH4", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin FROM TXPPASFOR WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
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
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

