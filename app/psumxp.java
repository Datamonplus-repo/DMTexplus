package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psumxp extends GXProcedure
{
   public psumxp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psumxp.class ), "" );
   }

   public psumxp( int remoteHandle ,
                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 )
   {
      psumxp.this.aP2 = new short[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             short[] aP2 )
   {
      psumxp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psumxp.this.A4882XDisCod = aP1[0];
      this.aP1 = aP1;
      psumxp.this.AV9XSumPzas = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9XSumPzas = (short)(0) ;
      /* Using cursor P03BL2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4882XDisCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4889XLinMan = P03BL2_A4889XLinMan[0] ;
         A4890XPdasNum = P03BL2_A4890XPdasNum[0] ;
         n4890XPdasNum = P03BL2_n4890XPdasNum[0] ;
         A4892XPzasPdas = P03BL2_A4892XPzasPdas[0] ;
         n4892XPzasPdas = P03BL2_n4892XPzasPdas[0] ;
         A4907XTotPzas = (short)((A4892XPzasPdas*A4890XPdasNum)) ;
         AV9XSumPzas = (short)(AV9XSumPzas+A4907XTotPzas) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psumxp.this.A396EmprCod;
      this.aP1[0] = psumxp.this.A4882XDisCod;
      this.aP2[0] = psumxp.this.AV9XSumPzas;
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
      P03BL2_A396EmprCod = new String[] {""} ;
      P03BL2_A4882XDisCod = new int[1] ;
      P03BL2_A4889XLinMan = new short[1] ;
      P03BL2_A4890XPdasNum = new short[1] ;
      P03BL2_n4890XPdasNum = new boolean[] {false} ;
      P03BL2_A4892XPzasPdas = new short[1] ;
      P03BL2_n4892XPzasPdas = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psumxp__default(),
         new Object[] {
             new Object[] {
            P03BL2_A396EmprCod, P03BL2_A4882XDisCod, P03BL2_A4889XLinMan, P03BL2_A4890XPdasNum, P03BL2_n4890XPdasNum, P03BL2_A4892XPzasPdas, P03BL2_n4892XPzasPdas
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9XSumPzas ;
   private short A4889XLinMan ;
   private short A4890XPdasNum ;
   private short A4892XPzasPdas ;
   private short A4907XTotPzas ;
   private short Gx_err ;
   private int A4882XDisCod ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private boolean n4890XPdasNum ;
   private boolean n4892XPzasPdas ;
   private short[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03BL2_A396EmprCod ;
   private int[] P03BL2_A4882XDisCod ;
   private short[] P03BL2_A4889XLinMan ;
   private short[] P03BL2_A4890XPdasNum ;
   private boolean[] P03BL2_n4890XPdasNum ;
   private short[] P03BL2_A4892XPzasPdas ;
   private boolean[] P03BL2_n4892XPzasPdas ;
}

final  class psumxp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03BL2", "SELECT EmprCod, XDisCod, XLinMan, XPdasNum, XPzasPdas FROM TXPXGEHD2 WHERE EmprCod = ? and XDisCod = ? ORDER BY EmprCod, XDisCod, XLinMan ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
      }
   }

}

