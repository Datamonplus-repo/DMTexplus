package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcammac extends GXProcedure
{
   public pcammac( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcammac.class ), "" );
   }

   public pcammac( int remoteHandle ,
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
                             byte[] aP5 )
   {
      pcammac.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        int[] aP4 ,
                        byte[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             int[] aP4 ,
                             byte[] aP5 ,
                             String[] aP6 )
   {
      pcammac.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcammac.this.AV12CliCod = aP1[0];
      this.aP1 = aP1;
      pcammac.this.AV13ForSer = aP2[0];
      this.aP2 = aP2;
      pcammac.this.AV14ForColNom = aP3[0];
      this.aP3 = aP3;
      pcammac.this.AV15Forcolnum = aP4[0];
      this.aP4 = aP4;
      pcammac.this.AV16TipColCod = aP5[0];
      this.aP5 = aP5;
      pcammac.this.AV17MacProcod = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02DW2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12CliCod), AV13ForSer, AV14ForColNom, Integer.valueOf(AV15Forcolnum), Byte.valueOf(AV16TipColCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P02DW2_A831TipColCod[0] ;
         A483ForColNum = P02DW2_A483ForColNum[0] ;
         A482ForColNom = P02DW2_A482ForColNom[0] ;
         A494ForSer = P02DW2_A494ForSer[0] ;
         A252CliCod = P02DW2_A252CliCod[0] ;
         A486ForNumCol = P02DW2_A486ForNumCol[0] ;
         AV9ForNumCol = A486ForNumCol ;
         AV10Linea = GXutil.str( A252CliCod, 6, 0) + A494ForSer + A482ForColNom + GXutil.str( A483ForColNum, 6, 0) + GXutil.str( A831TipColCod, 2, 0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV11Lineac = "" ;
      /* Using cursor P02DW3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV9ForNumCol)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A486ForNumCol = P02DW3_A486ForNumCol[0] ;
         A831TipColCod = P02DW3_A831TipColCod[0] ;
         A483ForColNum = P02DW3_A483ForColNum[0] ;
         A482ForColNom = P02DW3_A482ForColNom[0] ;
         A494ForSer = P02DW3_A494ForSer[0] ;
         A252CliCod = P02DW3_A252CliCod[0] ;
         A1514MacProCod = P02DW3_A1514MacProCod[0] ;
         n1514MacProCod = P02DW3_n1514MacProCod[0] ;
         AV11Lineac = GXutil.str( A252CliCod, 6, 0) + A494ForSer + A482ForColNom + GXutil.str( A483ForColNum, 6, 0) + GXutil.str( A831TipColCod, 2, 0) ;
         if ( GXutil.strcmp(AV10Linea, AV11Lineac) != 0 )
         {
            A1514MacProCod = AV17MacProcod ;
            n1514MacProCod = false ;
            System.out.println( AV11Lineac );
         }
         /* Using cursor P02DW4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n1514MacProCod), A1514MacProCod, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcammac.this.A396EmprCod;
      this.aP1[0] = pcammac.this.AV12CliCod;
      this.aP2[0] = pcammac.this.AV13ForSer;
      this.aP3[0] = pcammac.this.AV14ForColNom;
      this.aP4[0] = pcammac.this.AV15Forcolnum;
      this.aP5[0] = pcammac.this.AV16TipColCod;
      this.aP6[0] = pcammac.this.AV17MacProcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcammac");
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
      P02DW2_A396EmprCod = new String[] {""} ;
      P02DW2_A831TipColCod = new byte[1] ;
      P02DW2_A483ForColNum = new int[1] ;
      P02DW2_A482ForColNom = new String[] {""} ;
      P02DW2_A494ForSer = new String[] {""} ;
      P02DW2_A252CliCod = new int[1] ;
      P02DW2_A486ForNumCol = new int[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV10Linea = "" ;
      AV11Lineac = "" ;
      P02DW3_A396EmprCod = new String[] {""} ;
      P02DW3_A486ForNumCol = new int[1] ;
      P02DW3_A831TipColCod = new byte[1] ;
      P02DW3_A483ForColNum = new int[1] ;
      P02DW3_A482ForColNom = new String[] {""} ;
      P02DW3_A494ForSer = new String[] {""} ;
      P02DW3_A252CliCod = new int[1] ;
      P02DW3_A1514MacProCod = new String[] {""} ;
      P02DW3_n1514MacProCod = new boolean[] {false} ;
      A1514MacProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcammac__default(),
         new Object[] {
             new Object[] {
            P02DW2_A396EmprCod, P02DW2_A831TipColCod, P02DW2_A483ForColNum, P02DW2_A482ForColNom, P02DW2_A494ForSer, P02DW2_A252CliCod, P02DW2_A486ForNumCol
            }
            , new Object[] {
            P02DW3_A396EmprCod, P02DW3_A486ForNumCol, P02DW3_A831TipColCod, P02DW3_A483ForColNum, P02DW3_A482ForColNom, P02DW3_A494ForSer, P02DW3_A252CliCod, P02DW3_A1514MacProCod, P02DW3_n1514MacProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16TipColCod ;
   private byte A831TipColCod ;
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
   private String AV17MacProcod ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV10Linea ;
   private String AV11Lineac ;
   private String A1514MacProCod ;
   private boolean n1514MacProCod ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private int[] aP4 ;
   private byte[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P02DW2_A396EmprCod ;
   private byte[] P02DW2_A831TipColCod ;
   private int[] P02DW2_A483ForColNum ;
   private String[] P02DW2_A482ForColNom ;
   private String[] P02DW2_A494ForSer ;
   private int[] P02DW2_A252CliCod ;
   private int[] P02DW2_A486ForNumCol ;
   private String[] P02DW3_A396EmprCod ;
   private int[] P02DW3_A486ForNumCol ;
   private byte[] P02DW3_A831TipColCod ;
   private int[] P02DW3_A483ForColNum ;
   private String[] P02DW3_A482ForColNom ;
   private String[] P02DW3_A494ForSer ;
   private int[] P02DW3_A252CliCod ;
   private String[] P02DW3_A1514MacProCod ;
   private boolean[] P02DW3_n1514MacProCod ;
}

final  class pcammac__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02DW2", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod, ForNumCol FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P02DW3", "SELECT EmprCod, ForNumCol, TipColCod, ForColNum, ForColNom, ForSer, CliCod, MacProCod FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02DW4", "UPDATE TXPCFORMU SET MacProCod=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setString(4, (String)parms[4], 16);
               stmt.setString(5, (String)parms[5], 13);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               return;
      }
   }

}

