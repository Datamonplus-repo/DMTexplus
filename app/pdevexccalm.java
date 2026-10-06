package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdevexccalm extends GXProcedure
{
   public pdevexccalm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdevexccalm.class ), "" );
   }

   public pdevexccalm( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      pdevexccalm.this.aP3 = new String[] {""};
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
      pdevexccalm.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdevexccalm.this.A11935DVPrdNum = aP1[0];
      this.aP1 = aP1;
      pdevexccalm.this.A11941DVCC_AlmCo = aP2[0];
      this.aP2 = aP2;
      pdevexccalm.this.Gx_msg = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "Atencion.Este Almacen no Existe en este Producto", "") ;
      /* Using cursor P04XG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A11935DVPrdNum, Byte.valueOf(A11941DVCC_AlmCo)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         Gx_msg = " " ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdevexccalm.this.A396EmprCod;
      this.aP1[0] = pdevexccalm.this.A11935DVPrdNum;
      this.aP2[0] = pdevexccalm.this.A11941DVCC_AlmCo;
      this.aP3[0] = pdevexccalm.this.Gx_msg;
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
      P04XG2_A396EmprCod = new String[] {""} ;
      P04XG2_A11935DVPrdNum = new String[] {""} ;
      P04XG2_A11941DVCC_AlmCo = new byte[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdevexccalm__default(),
         new Object[] {
             new Object[] {
            P04XG2_A396EmprCod, P04XG2_A11935DVPrdNum, P04XG2_A11941DVCC_AlmCo
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11941DVCC_AlmCo ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A11935DVPrdNum ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04XG2_A396EmprCod ;
   private String[] P04XG2_A11935DVPrdNum ;
   private byte[] P04XG2_A11941DVCC_AlmCo ;
}

final  class pdevexccalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04XG2", "SELECT Emprcod, Prdnum, CC_AlmCod FROM LVNPRDALM WHERE Emprcod = ? and Prdnum = ? and CC_AlmCod = ? ORDER BY Emprcod, Prdnum, CC_AlmCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

