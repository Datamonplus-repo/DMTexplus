package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcamint extends GXProcedure
{
   public pcamint( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcamint.class ), "" );
   }

   public pcamint( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           String[] aP2 ,
                           String[] aP3 ,
                           int[] aP4 ,
                           byte[] aP5 )
   {
      pcamint.this.aP6 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        byte[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             byte[] aP6 )
   {
      pcamint.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcamint.this.AV12CliCod = aP1[0];
      this.aP1 = aP1;
      pcamint.this.AV13ForSer = aP2[0];
      this.aP2 = aP2;
      pcamint.this.AV14ForColNom = aP3[0];
      this.aP3 = aP3;
      pcamint.this.AV15Forcolnum = aP4[0];
      this.aP4 = aP4;
      pcamint.this.AV16TipColCod = aP5[0];
      this.aP5 = aP5;
      pcamint.this.AV8IntCod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02DV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12CliCod), AV13ForSer, AV14ForColNom, Integer.valueOf(AV15Forcolnum), Byte.valueOf(AV16TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02DV2_A831TipColCod[0] ;
         A483ForColNum = P02DV2_A483ForColNum[0] ;
         A482ForColNom = P02DV2_A482ForColNom[0] ;
         A494ForSer = P02DV2_A494ForSer[0] ;
         A252CliCod = P02DV2_A252CliCod[0] ;
         A486ForNumCol = P02DV2_A486ForNumCol[0] ;
         AV9ForNumCol = A486ForNumCol ;
         AV10Linea = GXutil.str( A252CliCod, 6, 0) + A494ForSer + A482ForColNom + GXutil.str( A483ForColNum, 6, 0) + GXutil.str( A831TipColCod, 2, 0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV11Lineac = "" ;
      /* Using cursor P02DV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9ForNumCol)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A486ForNumCol = P02DV3_A486ForNumCol[0] ;
         A831TipColCod = P02DV3_A831TipColCod[0] ;
         A483ForColNum = P02DV3_A483ForColNum[0] ;
         A482ForColNom = P02DV3_A482ForColNom[0] ;
         A494ForSer = P02DV3_A494ForSer[0] ;
         A252CliCod = P02DV3_A252CliCod[0] ;
         A583IntCod = P02DV3_A583IntCod[0] ;
         AV11Lineac = GXutil.str( A252CliCod, 6, 0) + A494ForSer + A482ForColNom + GXutil.str( A483ForColNum, 6, 0) + GXutil.str( A831TipColCod, 2, 0) ;
         if ( GXutil.strcmp(AV10Linea, AV11Lineac) != 0 )
         {
            A583IntCod = AV8IntCod ;
            System.out.println( AV11Lineac );
         }
         /* Using cursor P02DV4 */
         pr_default.execute(2, new Object[] {Byte.valueOf(A583IntCod), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcamint.this.A396EmprCod;
      this.aP1[0] = pcamint.this.AV12CliCod;
      this.aP2[0] = pcamint.this.AV13ForSer;
      this.aP3[0] = pcamint.this.AV14ForColNom;
      this.aP4[0] = pcamint.this.AV15Forcolnum;
      this.aP5[0] = pcamint.this.AV16TipColCod;
      this.aP6[0] = pcamint.this.AV8IntCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcamint");
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
      P02DV2_A396EmprCod = new String[] {""} ;
      P02DV2_A831TipColCod = new byte[1] ;
      P02DV2_A483ForColNum = new int[1] ;
      P02DV2_A482ForColNom = new String[] {""} ;
      P02DV2_A494ForSer = new String[] {""} ;
      P02DV2_A252CliCod = new int[1] ;
      P02DV2_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV10Linea = "" ;
      AV11Lineac = "" ;
      P02DV3_A396EmprCod = new String[] {""} ;
      P02DV3_A486ForNumCol = new int[1] ;
      P02DV3_A831TipColCod = new byte[1] ;
      P02DV3_A483ForColNum = new int[1] ;
      P02DV3_A482ForColNom = new String[] {""} ;
      P02DV3_A494ForSer = new String[] {""} ;
      P02DV3_A252CliCod = new int[1] ;
      P02DV3_A583IntCod = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcamint__default(),
         new Object[] {
             new Object[] {
            P02DV2_A396EmprCod, P02DV2_A831TipColCod, P02DV2_A483ForColNum, P02DV2_A482ForColNom, P02DV2_A494ForSer, P02DV2_A252CliCod, P02DV2_A486ForNumCol
            }
            , new Object[] {
            P02DV3_A396EmprCod, P02DV3_A486ForNumCol, P02DV3_A831TipColCod, P02DV3_A483ForColNum, P02DV3_A482ForColNom, P02DV3_A494ForSer, P02DV3_A252CliCod, P02DV3_A583IntCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TipColCod ;
   private byte AV8IntCod ;
   private byte A831TipColCod ;
   private byte A583IntCod ;
   private short Gx_err ;
   private int AV12CliCod ;
   private int AV15Forcolnum ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int A486ForNumCol ;
   private int AV9ForNumCol ;
   private String A396EmprCod ;
   private String AV13ForSer ;
   private String AV14ForColNom ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV10Linea ;
   private String AV11Lineac ;
   private byte[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02DV2_A396EmprCod ;
   private byte[] P02DV2_A831TipColCod ;
   private int[] P02DV2_A483ForColNum ;
   private String[] P02DV2_A482ForColNom ;
   private String[] P02DV2_A494ForSer ;
   private int[] P02DV2_A252CliCod ;
   private int[] P02DV2_A486ForNumCol ;
   private String[] P02DV3_A396EmprCod ;
   private int[] P02DV3_A486ForNumCol ;
   private byte[] P02DV3_A831TipColCod ;
   private int[] P02DV3_A483ForColNum ;
   private String[] P02DV3_A482ForColNom ;
   private String[] P02DV3_A494ForSer ;
   private int[] P02DV3_A252CliCod ;
   private byte[] P02DV3_A583IntCod ;
}

final  class pcamint__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02DV2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02DV3", "SELECT EmprCod, ForNumCol, TipColCod, ForColNum, ForColNom, ForSer, CliCod, IntCod FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02DV4", "UPDATE TXPCFORMU SET IntCod=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 16);
               stmt.setString(5, (String)parms[4], 13);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
      }
   }

}

