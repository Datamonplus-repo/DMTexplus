package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class per0006 extends GXProcedure
{
   public per0006( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( per0006.class ), "" );
   }

   public per0006( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 )
   {
      per0006.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      per0006.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      per0006.this.AV111Fec1 = aP1[0];
      this.aP1 = aP1;
      per0006.this.AV112Fec2 = aP2[0];
      this.aP2 = aP2;
      per0006.this.AV150UsurCod = aP3[0];
      this.aP3 = aP3;
      per0006.this.AV143Station = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P047F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV111Fec1, AV112Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A10874Er_hdrp = P047F2_A10874Er_hdrp[0] ;
         A10873Er_Hdrr = P047F2_A10873Er_Hdrr[0] ;
         A10872Er_Hdr = P047F2_A10872Er_Hdr[0] ;
         A10860Er_FecD = P047F2_A10860Er_FecD[0] ;
         n10860Er_FecD = P047F2_n10860Er_FecD[0] ;
         A10875Er_LinV = P047F2_A10875Er_LinV[0] ;
         AV163Barsit = (byte)(0) ;
         /* Using cursor P047F3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A129BarCod = P047F3_A129BarCod[0] ;
            A132BarCodReo = P047F3_A132BarCodReo[0] ;
            A130BarCodPar = P047F3_A130BarCodPar[0] ;
            A213BarSit = P047F3_A213BarSit[0] ;
            AV163Barsit = A213BarSit ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         if ( AV163Barsit >= 9 )
         {
            AV164Inc_obs = httpContext.getMessage( "Elimino HDR en tabla ERPROD, Situacion=9", "") + GXutil.str( A10872Er_Hdr, 8, 0) + GXutil.str( A10873Er_Hdrr, 1, 0) + A10874Er_hdrp + GXutil.newLine( ) ;
            new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV169Pgmname, AV150UsurCod, AV143Station, AV164Inc_obs, A10872Er_Hdr, A10873Er_Hdrr, A10874Er_hdrp) ;
            /* Using cursor P047F4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A10872Er_Hdr), Byte.valueOf(A10873Er_Hdrr), A10874Er_hdrp, Byte.valueOf(A10875Er_LinV)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPERPROD");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = per0006.this.A396EmprCod;
      this.aP1[0] = per0006.this.AV111Fec1;
      this.aP2[0] = per0006.this.AV112Fec2;
      this.aP3[0] = per0006.this.AV150UsurCod;
      this.aP4[0] = per0006.this.AV143Station;
      Application.commitDataStores(context, remoteHandle, pr_default, "per0006");
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
      P047F2_A396EmprCod = new String[] {""} ;
      P047F2_A10874Er_hdrp = new String[] {""} ;
      P047F2_A10873Er_Hdrr = new byte[1] ;
      P047F2_A10872Er_Hdr = new int[1] ;
      P047F2_A10860Er_FecD = new java.util.Date[] {GXutil.nullDate()} ;
      P047F2_n10860Er_FecD = new boolean[] {false} ;
      P047F2_A10875Er_LinV = new byte[1] ;
      A10874Er_hdrp = "" ;
      A10860Er_FecD = GXutil.nullDate() ;
      P047F3_A396EmprCod = new String[] {""} ;
      P047F3_A129BarCod = new int[1] ;
      P047F3_A132BarCodReo = new byte[1] ;
      P047F3_A130BarCodPar = new String[] {""} ;
      P047F3_A213BarSit = new byte[1] ;
      A130BarCodPar = "" ;
      AV164Inc_obs = "" ;
      AV169Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.per0006__default(),
         new Object[] {
             new Object[] {
            P047F2_A396EmprCod, P047F2_A10874Er_hdrp, P047F2_A10873Er_Hdrr, P047F2_A10872Er_Hdr, P047F2_A10860Er_FecD, P047F2_n10860Er_FecD, P047F2_A10875Er_LinV
            }
            , new Object[] {
            P047F3_A396EmprCod, P047F3_A129BarCod, P047F3_A132BarCodReo, P047F3_A130BarCodPar, P047F3_A213BarSit
            }
            , new Object[] {
            }
         }
      );
      AV169Pgmname = "PER0006" ;
      /* GeneXus formulas. */
      AV169Pgmname = "PER0006" ;
      Gx_err = (short)(0) ;
   }

   private byte A10873Er_Hdrr ;
   private byte A10875Er_LinV ;
   private byte AV163Barsit ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private short Gx_err ;
   private int A10872Er_Hdr ;
   private int A129BarCod ;
   private String A396EmprCod ;
   private String AV150UsurCod ;
   private String AV143Station ;
   private String scmdbuf ;
   private String A10874Er_hdrp ;
   private String A130BarCodPar ;
   private String AV169Pgmname ;
   private java.util.Date AV111Fec1 ;
   private java.util.Date AV112Fec2 ;
   private java.util.Date A10860Er_FecD ;
   private boolean n10860Er_FecD ;
   private String AV164Inc_obs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P047F2_A396EmprCod ;
   private String[] P047F2_A10874Er_hdrp ;
   private byte[] P047F2_A10873Er_Hdrr ;
   private int[] P047F2_A10872Er_Hdr ;
   private java.util.Date[] P047F2_A10860Er_FecD ;
   private boolean[] P047F2_n10860Er_FecD ;
   private byte[] P047F2_A10875Er_LinV ;
   private String[] P047F3_A396EmprCod ;
   private int[] P047F3_A129BarCod ;
   private byte[] P047F3_A132BarCodReo ;
   private String[] P047F3_A130BarCodPar ;
   private byte[] P047F3_A213BarSit ;
}

final  class per0006__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P047F2", "SELECT EmprCod, Er_hdrp, Er_Hdrr, Er_Hdr, Er_FecD, Er_LinV FROM TXPERPROD WHERE (EmprCod = ? and Er_FecD >= ?) AND (Er_FecD <= ?) ORDER BY EmprCod, Er_FecD ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P047F3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarSit FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P047F4", "DELETE FROM TXPERPROD  WHERE EmprCod = ? AND Er_Hdr = ? AND Er_Hdrr = ? AND Er_hdrp = ? AND Er_LinV = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPERPROD")
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
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

