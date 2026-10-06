package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusprot extends GXProcedure
{
   public pbusprot( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusprot.class ), "" );
   }

   public pbusprot( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      pbusprot.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      pbusprot.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusprot.this.A764ProForCod = aP1[0];
      this.aP1 = aP1;
      pbusprot.this.AV15Flag = aP2[0];
      this.aP2 = aP2;
      pbusprot.this.AV16ProForDsc = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Flag = (byte)(0) ;
      AV16ProForDsc = "" ;
      /* Using cursor P014A2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A764ProForCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A766ProForDsc = P014A2_A766ProForDsc[0] ;
         AV15Flag = (byte)(1) ;
         AV16ProForDsc = A766ProForDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusprot.this.A396EmprCod;
      this.aP1[0] = pbusprot.this.A764ProForCod;
      this.aP2[0] = pbusprot.this.AV15Flag;
      this.aP3[0] = pbusprot.this.AV16ProForDsc;
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
      P014A2_A396EmprCod = new String[] {""} ;
      P014A2_A764ProForCod = new String[] {""} ;
      P014A2_A766ProForDsc = new String[] {""} ;
      A766ProForDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusprot__default(),
         new Object[] {
             new Object[] {
            P014A2_A396EmprCod, P014A2_A764ProForCod, P014A2_A766ProForDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15Flag ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String AV16ProForDsc ;
   private String scmdbuf ;
   private String A766ProForDsc ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P014A2_A396EmprCod ;
   private String[] P014A2_A764ProForCod ;
   private String[] P014A2_A766ProForDsc ;
}

final  class pbusprot__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P014A2", "SELECT EmprCod, ProForCod, ProForDsc FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
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

