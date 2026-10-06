package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pgracob extends GXProcedure
{
   public pgracob( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pgracob.class ), "" );
   }

   public pgracob( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             byte[] aP1 )
   {
      pgracob.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 ,
                             String[] aP2 )
   {
      pgracob.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pgracob.this.A5022GraCod = aP1[0];
      this.aP1 = aP1;
      pgracob.this.AV17GraDsc = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P01HO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(A5022GraCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5023GraDsc = P01HO2_A5023GraDsc[0] ;
         n5023GraDsc = P01HO2_n5023GraDsc[0] ;
         AV17GraDsc = A5023GraDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pgracob.this.A396EmprCod;
      this.aP1[0] = pgracob.this.A5022GraCod;
      this.aP2[0] = pgracob.this.AV17GraDsc;
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
      P01HO2_A396EmprCod = new String[] {""} ;
      P01HO2_A5022GraCod = new byte[1] ;
      P01HO2_A5023GraDsc = new String[] {""} ;
      P01HO2_n5023GraDsc = new boolean[] {false} ;
      A5023GraDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pgracob__default(),
         new Object[] {
             new Object[] {
            P01HO2_A396EmprCod, P01HO2_A5022GraCod, P01HO2_A5023GraDsc, P01HO2_n5023GraDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A5022GraCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV17GraDsc ;
   private String scmdbuf ;
   private String A5023GraDsc ;
   private boolean n5023GraDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private byte[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P01HO2_A396EmprCod ;
   private byte[] P01HO2_A5022GraCod ;
   private String[] P01HO2_A5023GraDsc ;
   private boolean[] P01HO2_n5023GraDsc ;
}

final  class pgracob__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01HO2", "SELECT EmprCod, GraCod, GraDsc FROM TXPGRACOB WHERE EmprCod = ? and GraCod = ? ORDER BY EmprCod, GraCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
      }
   }

}

