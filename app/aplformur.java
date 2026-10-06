package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aplformur extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aplformur pgm = new aplformur (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aplformur( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aplformur.class ), "" );
   }

   public aplformur( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03AZ2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A831TipColCod = P03AZ2_A831TipColCod[0] ;
         A483ForColNum = P03AZ2_A483ForColNum[0] ;
         A482ForColNom = P03AZ2_A482ForColNom[0] ;
         A494ForSer = P03AZ2_A494ForSer[0] ;
         A252CliCod = P03AZ2_A252CliCod[0] ;
         A396EmprCod = P03AZ2_A396EmprCod[0] ;
         AV8Num_l = 0 ;
         /* Optimized group. */
         /* Using cursor P03AZ3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         cV8Num_l = P03AZ3_AV8Num_l[0] ;
         pr_default.close(1);
         AV8Num_l = (int)(AV8Num_l+cV8Num_l*1) ;
         /* End optimized group. */
         if ( AV8Num_l != 1 )
         {
            AV9Num_e = AV8Num_l ;
            /* Using cursor P03AZ4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A1160ProForL = P03AZ4_A1160ProForL[0] ;
               if ( AV9Num_e == 1 )
               {
               }
               else
               {
                  /* Using cursor P03AZ5 */
                  pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
                  System.out.println( httpContext.getMessage( "Delete Lformu", "") );
               }
               AV9Num_e = (int)(AV9Num_e+1) ;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "FIn", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(plformur.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aplformur");
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
      P03AZ2_A831TipColCod = new byte[1] ;
      P03AZ2_A483ForColNum = new int[1] ;
      P03AZ2_A482ForColNom = new String[] {""} ;
      P03AZ2_A494ForSer = new String[] {""} ;
      P03AZ2_A252CliCod = new int[1] ;
      P03AZ2_A396EmprCod = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      P03AZ3_AV8Num_l = new int[1] ;
      P03AZ4_A396EmprCod = new String[] {""} ;
      P03AZ4_A252CliCod = new int[1] ;
      P03AZ4_A494ForSer = new String[] {""} ;
      P03AZ4_A482ForColNom = new String[] {""} ;
      P03AZ4_A483ForColNum = new int[1] ;
      P03AZ4_A831TipColCod = new byte[1] ;
      P03AZ4_A1160ProForL = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aplformur__default(),
         new Object[] {
             new Object[] {
            P03AZ2_A831TipColCod, P03AZ2_A483ForColNum, P03AZ2_A482ForColNom, P03AZ2_A494ForSer, P03AZ2_A252CliCod, P03AZ2_A396EmprCod
            }
            , new Object[] {
            P03AZ3_AV8Num_l
            }
            , new Object[] {
            P03AZ4_A396EmprCod, P03AZ4_A252CliCod, P03AZ4_A494ForSer, P03AZ4_A482ForColNom, P03AZ4_A483ForColNum, P03AZ4_A831TipColCod, P03AZ4_A1160ProForL
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short A1160ProForL ;
   private short Gx_err ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int AV8Num_l ;
   private int cV8Num_l ;
   private int AV9Num_e ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private IDataStoreProvider pr_default ;
   private byte[] P03AZ2_A831TipColCod ;
   private int[] P03AZ2_A483ForColNum ;
   private String[] P03AZ2_A482ForColNom ;
   private String[] P03AZ2_A494ForSer ;
   private int[] P03AZ2_A252CliCod ;
   private String[] P03AZ2_A396EmprCod ;
   private int[] P03AZ3_AV8Num_l ;
   private String[] P03AZ4_A396EmprCod ;
   private int[] P03AZ4_A252CliCod ;
   private String[] P03AZ4_A494ForSer ;
   private String[] P03AZ4_A482ForColNom ;
   private int[] P03AZ4_A483ForColNum ;
   private byte[] P03AZ4_A831TipColCod ;
   private short[] P03AZ4_A1160ProForL ;
}

final  class aplformur__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03AZ2", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU WHERE EmprCod = '001' ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03AZ3", "SELECT COUNT(*) FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P03AZ4", "SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03AZ5", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLFORMU")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

