package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pleogam extends GXProcedure
{
   public pleogam( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pleogam.class ), "" );
   }

   public pleogam( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 ,
                          byte[] aP3 )
   {
      pleogam.this.aP4 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        int[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             int[] aP4 )
   {
      pleogam.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pleogam.this.AV12GamColCod = aP1[0];
      this.aP1 = aP1;
      pleogam.this.AV9NumGama = aP2[0];
      this.aP2 = aP2;
      pleogam.this.AV10FlagGam = aP3[0];
      this.aP3 = aP3;
      pleogam.this.AV11ForNumCol = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10FlagGam = (byte)(0) ;
      /* Using cursor P01GZ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11ForNumCol)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A486ForNumCol = P01GZ2_A486ForNumCol[0] ;
         A1191ForNomCli = P01GZ2_A1191ForNomCli[0] ;
         n1191ForNomCli = P01GZ2_n1191ForNomCli[0] ;
         A1192ForNumCli = P01GZ2_A1192ForNumCli[0] ;
         n1192ForNumCli = P01GZ2_n1192ForNumCli[0] ;
         A252CliCod = P01GZ2_A252CliCod[0] ;
         A494ForSer = P01GZ2_A494ForSer[0] ;
         A482ForColNom = P01GZ2_A482ForColNom[0] ;
         A483ForColNum = P01GZ2_A483ForColNum[0] ;
         A831TipColCod = P01GZ2_A831TipColCod[0] ;
         if ( GXutil.strcmp(A1191ForNomCli, AV12GamColCod) == 0 )
         {
            AV9NumGama = A1192ForNumCli ;
            AV10FlagGam = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV10FlagGam == 0 )
      {
         /* Using cursor P01GZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV12GamColCod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4997GamColCod = P01GZ3_A4997GamColCod[0] ;
            A4998GamColNum = P01GZ3_A4998GamColNum[0] ;
            n4998GamColNum = P01GZ3_n4998GamColNum[0] ;
            A4998GamColNum = (int)(A4998GamColNum+1) ;
            n4998GamColNum = false ;
            AV9NumGama = A4998GamColNum ;
            AV10FlagGam = (byte)(1) ;
            /* Using cursor P01GZ4 */
            pr_default.execute(2, new Object[] {Boolean.valueOf(n4998GamColNum), Integer.valueOf(A4998GamColNum), A396EmprCod, A4997GamColCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGAMCOL");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pleogam.this.A396EmprCod;
      this.aP1[0] = pleogam.this.AV12GamColCod;
      this.aP2[0] = pleogam.this.AV9NumGama;
      this.aP3[0] = pleogam.this.AV10FlagGam;
      this.aP4[0] = pleogam.this.AV11ForNumCol;
      Application.commitDataStores(context, remoteHandle, pr_default, "pleogam");
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
      P01GZ2_A396EmprCod = new String[] {""} ;
      P01GZ2_A486ForNumCol = new int[1] ;
      P01GZ2_A1191ForNomCli = new String[] {""} ;
      P01GZ2_n1191ForNomCli = new boolean[] {false} ;
      P01GZ2_A1192ForNumCli = new int[1] ;
      P01GZ2_n1192ForNumCli = new boolean[] {false} ;
      P01GZ2_A252CliCod = new int[1] ;
      P01GZ2_A494ForSer = new String[] {""} ;
      P01GZ2_A482ForColNom = new String[] {""} ;
      P01GZ2_A483ForColNum = new int[1] ;
      P01GZ2_A831TipColCod = new byte[1] ;
      A1191ForNomCli = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      P01GZ3_A396EmprCod = new String[] {""} ;
      P01GZ3_A4997GamColCod = new String[] {""} ;
      P01GZ3_A4998GamColNum = new int[1] ;
      P01GZ3_n4998GamColNum = new boolean[] {false} ;
      A4997GamColCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pleogam__default(),
         new Object[] {
             new Object[] {
            P01GZ2_A396EmprCod, P01GZ2_A486ForNumCol, P01GZ2_A1191ForNomCli, P01GZ2_n1191ForNomCli, P01GZ2_A1192ForNumCli, P01GZ2_n1192ForNumCli, P01GZ2_A252CliCod, P01GZ2_A494ForSer, P01GZ2_A482ForColNom, P01GZ2_A483ForColNum,
            P01GZ2_A831TipColCod
            }
            , new Object[] {
            P01GZ3_A396EmprCod, P01GZ3_A4997GamColCod, P01GZ3_A4998GamColNum, P01GZ3_n4998GamColNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10FlagGam ;
   private byte A831TipColCod ;
   private short Gx_err ;
   private int AV9NumGama ;
   private int AV11ForNumCol ;
   private int A486ForNumCol ;
   private int A1192ForNumCli ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A4998GamColNum ;
   private String A396EmprCod ;
   private String AV12GamColCod ;
   private String scmdbuf ;
   private String A1191ForNomCli ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String A4997GamColCod ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n4998GamColNum ;
   private int[] aP4 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01GZ2_A396EmprCod ;
   private int[] P01GZ2_A486ForNumCol ;
   private String[] P01GZ2_A1191ForNomCli ;
   private boolean[] P01GZ2_n1191ForNomCli ;
   private int[] P01GZ2_A1192ForNumCli ;
   private boolean[] P01GZ2_n1192ForNumCli ;
   private int[] P01GZ2_A252CliCod ;
   private String[] P01GZ2_A494ForSer ;
   private String[] P01GZ2_A482ForColNom ;
   private int[] P01GZ2_A483ForColNum ;
   private byte[] P01GZ2_A831TipColCod ;
   private String[] P01GZ3_A396EmprCod ;
   private String[] P01GZ3_A4997GamColCod ;
   private int[] P01GZ3_A4998GamColNum ;
   private boolean[] P01GZ3_n4998GamColNum ;
}

final  class pleogam__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01GZ2", "SELECT EmprCod, ForNumCol, ForNomCli, ForNumCli, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? and ForNumCol = ? ORDER BY EmprCod, ForNumCol ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01GZ3", "SELECT EmprCod, GamColCod, GamColNum FROM TXPGAMCOL WHERE EmprCod = ? and GamColCod = ? ORDER BY EmprCod, GamColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01GZ4", "UPDATE TXPGAMCOL SET GamColNum=?  WHERE EmprCod = ? AND GamColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGAMCOL")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 13);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((byte[]) buf[10])[0] = rslt.getByte(9);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 13);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 13);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 13);
               return;
      }
   }

}

