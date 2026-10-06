package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacstef extends GXProcedure
{
   public pacstef( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacstef.class ), "" );
   }

   public pacstef( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           java.math.BigDecimal[] aP2 )
   {
      pacstef.this.aP3 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        java.math.BigDecimal[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             java.math.BigDecimal[] aP3 )
   {
      pacstef.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacstef.this.AV8AlbRecCod = aP1[0];
      this.aP1 = aP1;
      pacstef.this.AV10Metros = aP2[0];
      this.aP2 = aP2;
      pacstef.this.AV14Metros_old = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P036H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8AlbRecCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A44AlbRecCod = P036H2_A44AlbRecCod[0] ;
         A60AlbRUniUti = P036H2_A60AlbRUniUti[0] ;
         A47AlbREst = P036H2_A47AlbREst[0] ;
         A58AlbRUniEnt = P036H2_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = A60AlbRUniUti.subtract(AV14Metros_old).add(AV10Metros) ;
         A47AlbREst = (byte)(0) ;
         if ( DecimalUtil.compareTo(A58AlbRUniEnt, A60AlbRUniUti) <= 0 )
         {
            A47AlbREst = (byte)(1) ;
         }
         /* Using cursor P036H3 */
         pr_default.execute(1, new Object[] {A60AlbRUniUti, Byte.valueOf(A47AlbREst), A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacstef.this.A396EmprCod;
      this.aP1[0] = pacstef.this.AV8AlbRecCod;
      this.aP2[0] = pacstef.this.AV10Metros;
      this.aP3[0] = pacstef.this.AV14Metros_old;
      Application.commitDataStores(context, remoteHandle, pr_default, "pacstef");
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
      P036H2_A396EmprCod = new String[] {""} ;
      P036H2_A44AlbRecCod = new int[1] ;
      P036H2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P036H2_A47AlbREst = new byte[1] ;
      P036H2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacstef__default(),
         new Object[] {
             new Object[] {
            P036H2_A396EmprCod, P036H2_A44AlbRecCod, P036H2_A60AlbRUniUti, P036H2_A47AlbREst, P036H2_A58AlbRUniEnt
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short Gx_err ;
   private int AV8AlbRecCod ;
   private int A44AlbRecCod ;
   private java.math.BigDecimal AV10Metros ;
   private java.math.BigDecimal AV14Metros_old ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private java.math.BigDecimal[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private java.math.BigDecimal[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P036H2_A396EmprCod ;
   private int[] P036H2_A44AlbRecCod ;
   private java.math.BigDecimal[] P036H2_A60AlbRUniUti ;
   private byte[] P036H2_A47AlbREst ;
   private java.math.BigDecimal[] P036H2_A58AlbRUniEnt ;
}

final  class pacstef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P036H2", "SELECT EmprCod, AlbRecCod, AlbRUniUti, AlbREst, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P036H3", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
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
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

