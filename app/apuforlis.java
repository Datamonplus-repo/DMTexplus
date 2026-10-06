package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apuforlis extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apuforlis pgm = new apuforlis (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apuforlis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apuforlis.class ), "" );
   }

   public apuforlis( int remoteHandle ,
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
      AV24N_reg = 0 ;
      /* Using cursor P03552 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7797Sim_lin = P03552_A7797Sim_lin[0] ;
         A831TipColCod = P03552_A831TipColCod[0] ;
         A483ForColNum = P03552_A483ForColNum[0] ;
         A482ForColNom = P03552_A482ForColNom[0] ;
         A494ForSer = P03552_A494ForSer[0] ;
         A252CliCod = P03552_A252CliCod[0] ;
         A396EmprCod = P03552_A396EmprCod[0] ;
         AV23Emprcod = A396EmprCod ;
         AV18Clicod = A252CliCod ;
         AV19Forser = A494ForSer ;
         AV20Forcolnom = A482ForColNom ;
         AV21Forcolnum = A483ForColNum ;
         AV22Tipcolcod = A831TipColCod ;
         /* Execute user subroutine: 'CFORMU' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV17Cformu == 0 )
         {
            AV24N_reg = (int)(AV24N_reg+1) ;
            Gx_msg = httpContext.getMessage( "Eliminando...", "") + GXutil.str( AV24N_reg, 6, 0) ;
            System.out.println( Gx_msg );
            /* Using cursor P03553 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A7797Sim_lin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFORLIS");
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'CFORMU' Routine */
      returnInSub = false ;
      AV17Cformu = (byte)(0) ;
      /* Using cursor P03554 */
      pr_default.execute(2, new Object[] {AV23Emprcod, Integer.valueOf(AV18Clicod), AV19Forser, AV20Forcolnom, Integer.valueOf(AV21Forcolnum), Byte.valueOf(AV22Tipcolcod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A831TipColCod = P03554_A831TipColCod[0] ;
         A483ForColNum = P03554_A483ForColNum[0] ;
         A482ForColNom = P03554_A482ForColNom[0] ;
         A494ForSer = P03554_A494ForSer[0] ;
         A252CliCod = P03554_A252CliCod[0] ;
         A396EmprCod = P03554_A396EmprCod[0] ;
         AV17Cformu = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(puforlis.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apuforlis");
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
      P03552_A7797Sim_lin = new short[1] ;
      P03552_A831TipColCod = new byte[1] ;
      P03552_A483ForColNum = new int[1] ;
      P03552_A482ForColNom = new String[] {""} ;
      P03552_A494ForSer = new String[] {""} ;
      P03552_A252CliCod = new int[1] ;
      P03552_A396EmprCod = new String[] {""} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A396EmprCod = "" ;
      AV23Emprcod = "" ;
      AV19Forser = "" ;
      AV20Forcolnom = "" ;
      Gx_msg = "" ;
      P03554_A831TipColCod = new byte[1] ;
      P03554_A483ForColNum = new int[1] ;
      P03554_A482ForColNom = new String[] {""} ;
      P03554_A494ForSer = new String[] {""} ;
      P03554_A252CliCod = new int[1] ;
      P03554_A396EmprCod = new String[] {""} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apuforlis__default(),
         new Object[] {
             new Object[] {
            P03552_A7797Sim_lin, P03552_A831TipColCod, P03552_A483ForColNum, P03552_A482ForColNom, P03552_A494ForSer, P03552_A252CliCod, P03552_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            P03554_A831TipColCod, P03554_A483ForColNum, P03554_A482ForColNom, P03554_A494ForSer, P03554_A252CliCod, P03554_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A831TipColCod ;
   private byte AV22Tipcolcod ;
   private byte AV17Cformu ;
   private short A7797Sim_lin ;
   private short Gx_err ;
   private int AV24N_reg ;
   private int A483ForColNum ;
   private int A252CliCod ;
   private int AV18Clicod ;
   private int AV21Forcolnum ;
   private String scmdbuf ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A396EmprCod ;
   private String AV23Emprcod ;
   private String AV19Forser ;
   private String AV20Forcolnom ;
   private String Gx_msg ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private short[] P03552_A7797Sim_lin ;
   private byte[] P03552_A831TipColCod ;
   private int[] P03552_A483ForColNum ;
   private String[] P03552_A482ForColNom ;
   private String[] P03552_A494ForSer ;
   private int[] P03552_A252CliCod ;
   private String[] P03552_A396EmprCod ;
   private byte[] P03554_A831TipColCod ;
   private int[] P03554_A483ForColNum ;
   private String[] P03554_A482ForColNom ;
   private String[] P03554_A494ForSer ;
   private int[] P03554_A252CliCod ;
   private String[] P03554_A396EmprCod ;
}

final  class apuforlis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03552", "SELECT Sim_lin, TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPFORLIS ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03553", "DELETE FROM TXPFORLIS  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND Sim_lin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFORLIS")
         ,new ForEachCursor("P03554", "SELECT TipColCod, ForColNum, ForColNom, ForSer, CliCod, EmprCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
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
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

