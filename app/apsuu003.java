package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu003 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu003 pgm = new apsuu003 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apsuu003( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu003.class ), "" );
   }

   public apsuu003( int remoteHandle ,
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
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8Emprcod = "001" ;
      /* Using cursor P02TV2 */
      pr_default.execute(0, new Object[] {AV8Emprcod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P02TV2_A396EmprCod[0] ;
         A4384ForTipArt = P02TV2_A4384ForTipArt[0] ;
         n4384ForTipArt = P02TV2_n4384ForTipArt[0] ;
         A831TipColCod = P02TV2_A831TipColCod[0] ;
         A483ForColNum = P02TV2_A483ForColNum[0] ;
         A482ForColNom = P02TV2_A482ForColNom[0] ;
         A494ForSer = P02TV2_A494ForSer[0] ;
         A252CliCod = P02TV2_A252CliCod[0] ;
         GXt_int1 = A4384ForTipArt ;
         GXv_int2[0] = GXt_int1 ;
         new app.ptipart(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, GXv_int2) ;
         apsuu003.this.GXt_int1 = GXv_int2[0] ;
         A4384ForTipArt = GXt_int1 ;
         n4384ForTipArt = false ;
         Gx_msg = ".." + GXutil.str( A252CliCod, 6, 0) + A494ForSer + A482ForColNom + GXutil.str( A483ForColNum, 6, 0) + GXutil.str( A831TipColCod, 2, 0) + GXutil.str( A4384ForTipArt, 4, 0) ;
         System.out.println( Gx_msg );
         /* Using cursor P02TV3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4384ForTipArt), Short.valueOf(A4384ForTipArt), A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORMU");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psuu003.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu003");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Emprcod = "" ;
      scmdbuf = "" ;
      P02TV2_A396EmprCod = new String[] {""} ;
      P02TV2_A4384ForTipArt = new short[1] ;
      P02TV2_n4384ForTipArt = new boolean[] {false} ;
      P02TV2_A831TipColCod = new byte[1] ;
      P02TV2_A483ForColNum = new int[1] ;
      P02TV2_A482ForColNom = new String[] {""} ;
      P02TV2_A494ForSer = new String[] {""} ;
      P02TV2_A252CliCod = new int[1] ;
      A396EmprCod = "" ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      GXv_int2 = new short[1] ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu003__default(),
         new Object[] {
             new Object[] {
            P02TV2_A396EmprCod, P02TV2_A4384ForTipArt, P02TV2_n4384ForTipArt, P02TV2_A831TipColCod, P02TV2_A483ForColNum, P02TV2_A482ForColNom, P02TV2_A494ForSer, P02TV2_A252CliCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private short A4384ForTipArt ;
   private short GXt_int1 ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private String AV8Emprcod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String Gx_msg ;
   private boolean n4384ForTipArt ;
   private IDataStoreProvider pr_default ;
   private String[] P02TV2_A396EmprCod ;
   private short[] P02TV2_A4384ForTipArt ;
   private boolean[] P02TV2_n4384ForTipArt ;
   private byte[] P02TV2_A831TipColCod ;
   private int[] P02TV2_A483ForColNum ;
   private String[] P02TV2_A482ForColNom ;
   private String[] P02TV2_A494ForSer ;
   private int[] P02TV2_A252CliCod ;
}

final  class apsuu003__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02TV2", "SELECT EmprCod, ForTipArt, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE EmprCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02TV3", "UPDATE TXPCFORMU SET ForTipArt=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCFORMU")
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
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
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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

