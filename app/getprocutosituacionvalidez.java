package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getprocutosituacionvalidez extends GXProcedure
{
   public getprocutosituacionvalidez( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getprocutosituacionvalidez.class ), "" );
   }

   public getprocutosituacionvalidez( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String aP0 ,
                           String aP1 )
   {
      getprocutosituacionvalidez.this.aP2 = new byte[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             byte[] aP2 )
   {
      getprocutosituacionvalidez.this.AV8EmprCod = aP0;
      getprocutosituacionvalidez.this.AV9PrdNum = aP1;
      getprocutosituacionvalidez.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P0ADY2 */
      pr_default.execute(0, new Object[] {AV8EmprCod, AV9PrdNum});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A719PrdNum = P0ADY2_A719PrdNum[0] ;
         A396EmprCod = P0ADY2_A396EmprCod[0] ;
         A856ValCod = P0ADY2_A856ValCod[0] ;
         AV11ValCod = A856ValCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = getprocutosituacionvalidez.this.AV11ValCod;
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
      P0ADY2_A719PrdNum = new String[] {""} ;
      P0ADY2_A396EmprCod = new String[] {""} ;
      P0ADY2_A856ValCod = new byte[1] ;
      A719PrdNum = "" ;
      A396EmprCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.getprocutosituacionvalidez__default(),
         new Object[] {
             new Object[] {
            P0ADY2_A719PrdNum, P0ADY2_A396EmprCod, P0ADY2_A856ValCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV11ValCod ;
   private byte A856ValCod ;
   private short Gx_err ;
   private String AV8EmprCod ;
   private String AV9PrdNum ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A396EmprCod ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P0ADY2_A719PrdNum ;
   private String[] P0ADY2_A396EmprCod ;
   private byte[] P0ADY2_A856ValCod ;
}

final  class getprocutosituacionvalidez__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0ADY2", "SELECT PrdNum, EmprCod, ValCod FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

