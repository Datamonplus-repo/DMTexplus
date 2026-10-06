package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprddsc extends GXProcedure
{
   public pprddsc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprddsc.class ), "" );
   }

   public pprddsc( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 )
   {
      pprddsc.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pprddsc.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprddsc.this.AV9PrdNum = aP1[0];
      this.aP1 = aP1;
      pprddsc.this.AV8PrdNom = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8PrdNom = "" ;
      if ( ! (GXutil.strcmp("", AV9PrdNum)==0) )
      {
         AV12GXLvl4 = (byte)(0) ;
         /* Using cursor P01QI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV9PrdNum});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A719PrdNum = P01QI2_A719PrdNum[0] ;
            A718PrdNom = P01QI2_A718PrdNom[0] ;
            AV12GXLvl4 = (byte)(1) ;
            AV8PrdNom = A718PrdNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV12GXLvl4 == 0 )
         {
            AV8PrdNom = httpContext.getMessage( "Error", "") ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprddsc.this.A396EmprCod;
      this.aP1[0] = pprddsc.this.AV9PrdNum;
      this.aP2[0] = pprddsc.this.AV8PrdNom;
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
      P01QI2_A396EmprCod = new String[] {""} ;
      P01QI2_A719PrdNum = new String[] {""} ;
      P01QI2_A718PrdNom = new String[] {""} ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprddsc__default(),
         new Object[] {
             new Object[] {
            P01QI2_A396EmprCod, P01QI2_A719PrdNum, P01QI2_A718PrdNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV12GXLvl4 ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV9PrdNum ;
   private String AV8PrdNom ;
   private String scmdbuf ;
   private String A719PrdNum ;
   private String A718PrdNom ;
   private String[] aP2 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01QI2_A396EmprCod ;
   private String[] P01QI2_A719PrdNum ;
   private String[] P01QI2_A718PrdNom ;
}

final  class pprddsc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01QI2", "SELECT EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
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

