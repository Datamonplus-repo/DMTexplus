package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptrnb00 extends GXProcedure
{
   public ptrnb00( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptrnb00.class ), "" );
   }

   public ptrnb00( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 )
   {
      ptrnb00.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      ptrnb00.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ptrnb00.this.A840TrnCod = aP1[0];
      this.aP1 = aP1;
      ptrnb00.this.AV8AlbMat = aP2[0];
      this.aP2 = aP2;
      ptrnb00.this.AV9AlbLic = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9AlbLic = " " ;
      AV8AlbMat = " " ;
      /* Using cursor P043E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A840TrnCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3643TrnNif = P043E2_A3643TrnNif[0] ;
         n3643TrnNif = P043E2_n3643TrnNif[0] ;
         A10776TrnMat = P043E2_A10776TrnMat[0] ;
         n10776TrnMat = P043E2_n10776TrnMat[0] ;
         AV9AlbLic = A3643TrnNif ;
         AV8AlbMat = A10776TrnMat ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ptrnb00.this.A396EmprCod;
      this.aP1[0] = ptrnb00.this.A840TrnCod;
      this.aP2[0] = ptrnb00.this.AV8AlbMat;
      this.aP3[0] = ptrnb00.this.AV9AlbLic;
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
      P043E2_A396EmprCod = new String[] {""} ;
      P043E2_A840TrnCod = new short[1] ;
      P043E2_A3643TrnNif = new String[] {""} ;
      P043E2_n3643TrnNif = new boolean[] {false} ;
      P043E2_A10776TrnMat = new String[] {""} ;
      P043E2_n10776TrnMat = new boolean[] {false} ;
      A3643TrnNif = "" ;
      A10776TrnMat = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptrnb00__default(),
         new Object[] {
             new Object[] {
            P043E2_A396EmprCod, P043E2_A840TrnCod, P043E2_A3643TrnNif, P043E2_n3643TrnNif, P043E2_A10776TrnMat, P043E2_n10776TrnMat
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A840TrnCod ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV8AlbMat ;
   private String AV9AlbLic ;
   private String scmdbuf ;
   private String A3643TrnNif ;
   private String A10776TrnMat ;
   private boolean n3643TrnNif ;
   private boolean n10776TrnMat ;
   private String[] aP3 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P043E2_A396EmprCod ;
   private short[] P043E2_A840TrnCod ;
   private String[] P043E2_A3643TrnNif ;
   private boolean[] P043E2_n3643TrnNif ;
   private String[] P043E2_A10776TrnMat ;
   private boolean[] P043E2_n10776TrnMat ;
}

final  class ptrnb00__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P043E2", "SELECT EmprCod, TrnCod, TrnNif, TrnMat FROM TXPTRANSP WHERE EmprCod = ? and TrnCod = ? ORDER BY EmprCod, TrnCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

