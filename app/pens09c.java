package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens09c extends GXProcedure
{
   public pens09c( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens09c.class ), "" );
   }

   public pens09c( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 )
   {
      pens09c.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             int[] aP3 )
   {
      pens09c.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens09c.this.A5532Lb_numero = aP1[0];
      this.aP1 = aP1;
      pens09c.this.AV8Lb_colnom = aP2[0];
      this.aP2 = aP2;
      pens09c.this.AV9Lb_colnum = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P031H2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5536Lb_ColNom = P031H2_A5536Lb_ColNom[0] ;
         A5537Lb_ColNum = P031H2_A5537Lb_ColNum[0] ;
         if ( GXutil.strcmp(AV8Lb_colnom, " ") != 0 )
         {
            A5536Lb_ColNom = AV8Lb_colnom ;
         }
         if ( AV9Lb_colnum > 0 )
         {
            A5537Lb_ColNum = AV9Lb_colnum ;
         }
         /* Using cursor P031H3 */
         pr_default.execute(1, new Object[] {A5536Lb_ColNom, Integer.valueOf(A5537Lb_ColNum), A396EmprCod, Integer.valueOf(A5532Lb_numero)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS001");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens09c.this.A396EmprCod;
      this.aP1[0] = pens09c.this.A5532Lb_numero;
      this.aP2[0] = pens09c.this.AV8Lb_colnom;
      this.aP3[0] = pens09c.this.AV9Lb_colnum;
      Application.commitDataStores(context, remoteHandle, pr_default, "pens09c");
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
      P031H2_A396EmprCod = new String[] {""} ;
      P031H2_A5532Lb_numero = new int[1] ;
      P031H2_A5536Lb_ColNom = new String[] {""} ;
      P031H2_A5537Lb_ColNum = new int[1] ;
      A5536Lb_ColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pens09c__default(),
         new Object[] {
             new Object[] {
            P031H2_A396EmprCod, P031H2_A5532Lb_numero, P031H2_A5536Lb_ColNom, P031H2_A5537Lb_ColNum
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A5532Lb_numero ;
   private int AV9Lb_colnum ;
   private int A5537Lb_ColNum ;
   private String A396EmprCod ;
   private String AV8Lb_colnom ;
   private String scmdbuf ;
   private String A5536Lb_ColNom ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P031H2_A396EmprCod ;
   private int[] P031H2_A5532Lb_numero ;
   private String[] P031H2_A5536Lb_ColNom ;
   private int[] P031H2_A5537Lb_ColNum ;
}

final  class pens09c__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P031H2", "SELECT EmprCod, Lb_numero, Lb_ColNom, Lb_ColNum FROM TXPENS001 WHERE EmprCod = ? and Lb_numero = ? ORDER BY EmprCod, Lb_numero ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P031H3", "UPDATE TXPENS001 SET Lb_ColNom=?, Lb_ColNum=?  WHERE EmprCod = ? AND Lb_numero = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS001")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setString(1, (String)parms[0], 13);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

