package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psamenumero extends GXProcedure
{
   public psamenumero( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psamenumero.class ), "" );
   }

   public psamenumero( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          String[] aP2 )
   {
      psamenumero.this.aP3 = new int[] {0};
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
      psamenumero.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psamenumero.this.AV11Lb_numero = aP1[0];
      this.aP1 = aP1;
      psamenumero.this.AV13Lb_colnom = aP2[0];
      this.aP2 = aP2;
      psamenumero.this.AV12Lb_ColNum = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = "" ;
      /* Using cursor P04K32 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV12Lb_ColNum)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A5537Lb_ColNum = P04K32_A5537Lb_ColNum[0] ;
         A5532Lb_numero = P04K32_A5532Lb_numero[0] ;
         A5536Lb_ColNom = P04K32_A5536Lb_ColNom[0] ;
         if ( AV11Lb_numero == A5532Lb_numero )
         {
         }
         else
         {
            if ( GXutil.strcmp(AV13Lb_colnom, A5536Lb_ColNom) != 0 )
            {
               Gx_msg = httpContext.getMessage( "AVISO.", "") + GXutil.newLine( ) ;
               Gx_msg += httpContext.getMessage( "Color ", "") + AV13Lb_colnom + httpContext.getMessage( " codigo ", "") + GXutil.str( AV12Lb_ColNum, 6, 0) + GXutil.newLine( ) ;
               Gx_msg += httpContext.getMessage( "ya ha sido utilizado con la Descripcion ", "") + GXutil.trim( A5536Lb_ColNom) + GXutil.newLine( ) ;
               Gx_msg += httpContext.getMessage( "N. Ensayo  ", "") + GXutil.str( A5532Lb_numero, 8, 0) + GXutil.newLine( ) ;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( GXutil.strcmp(Gx_msg, " ") != 0 )
      {
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = psamenumero.this.A396EmprCod;
      this.aP1[0] = psamenumero.this.AV11Lb_numero;
      this.aP2[0] = psamenumero.this.AV13Lb_colnom;
      this.aP3[0] = psamenumero.this.AV12Lb_ColNum;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P04K32_A396EmprCod = new String[] {""} ;
      P04K32_A5537Lb_ColNum = new int[1] ;
      P04K32_A5532Lb_numero = new int[1] ;
      P04K32_A5536Lb_ColNom = new String[] {""} ;
      A5536Lb_ColNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psamenumero__default(),
         new Object[] {
             new Object[] {
            P04K32_A396EmprCod, P04K32_A5537Lb_ColNum, P04K32_A5532Lb_numero, P04K32_A5536Lb_ColNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV11Lb_numero ;
   private int AV12Lb_ColNum ;
   private int A5537Lb_ColNum ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String AV13Lb_colnom ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A5536Lb_ColNom ;
   private int[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04K32_A396EmprCod ;
   private int[] P04K32_A5537Lb_ColNum ;
   private int[] P04K32_A5532Lb_numero ;
   private String[] P04K32_A5536Lb_ColNom ;
}

final  class psamenumero__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04K32", "SELECT EmprCod, Lb_ColNum, Lb_numero, Lb_ColNom FROM TXPENS001 WHERE EmprCod = ? and Lb_ColNum = ? ORDER BY EmprCod, Lb_ColNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
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

