package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pactrelcmp extends GXProcedure
{
   public pactrelcmp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pactrelcmp.class ), "" );
   }

   public pactrelcmp( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pactrelcmp.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pactrelcmp.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pactrelcmp.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pactrelcmp.this.A45AlbRef = aP2[0];
      this.aP2 = aP2;
      pactrelcmp.this.A6463AlbRLote = aP3[0];
      this.aP3 = aP3;
      pactrelcmp.this.AV10AlbNumb = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P04WC2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A45AlbRef, A6463AlbRLote});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8028AlbNumB = P04WC2_A8028AlbNumB[0] ;
         A44AlbRecCod = P04WC2_A44AlbRecCod[0] ;
         if ( ( GXutil.strcmp(A8028AlbNumB, " ") == 0 ) || ( GXutil.strcmp(A8028AlbNumB, httpContext.getMessage( "F", "")) == 0 ) )
         {
            A8028AlbNumB = AV10AlbNumb ;
            Gx_msg = httpContext.getMessage( "Actualizando ... ", "") + GXutil.str( A252CliCod, 6, 0) + " " + GXutil.trim( A45AlbRef) + " " + GXutil.trim( A6463AlbRLote) + " " + GXutil.trim( A8028AlbNumB) ;
            System.out.println( Gx_msg );
         }
         /* Using cursor P04WC3 */
         pr_default.execute(1, new Object[] {A8028AlbNumB, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pactrelcmp.this.A396EmprCod;
      this.aP1[0] = pactrelcmp.this.A252CliCod;
      this.aP2[0] = pactrelcmp.this.A45AlbRef;
      this.aP3[0] = pactrelcmp.this.A6463AlbRLote;
      this.aP4[0] = pactrelcmp.this.AV10AlbNumb;
      Application.commitDataStores(context, remoteHandle, pr_default, "pactrelcmp");
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
      P04WC2_A396EmprCod = new String[] {""} ;
      P04WC2_A252CliCod = new int[1] ;
      P04WC2_A45AlbRef = new String[] {""} ;
      P04WC2_A6463AlbRLote = new String[] {""} ;
      P04WC2_A8028AlbNumB = new String[] {""} ;
      P04WC2_A44AlbRecCod = new int[1] ;
      A8028AlbNumB = "" ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pactrelcmp__default(),
         new Object[] {
             new Object[] {
            P04WC2_A396EmprCod, P04WC2_A252CliCod, P04WC2_A45AlbRef, P04WC2_A6463AlbRLote, P04WC2_A8028AlbNumB, P04WC2_A44AlbRecCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private int A44AlbRecCod ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String A6463AlbRLote ;
   private String AV10AlbNumb ;
   private String scmdbuf ;
   private String A8028AlbNumB ;
   private String Gx_msg ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P04WC2_A396EmprCod ;
   private int[] P04WC2_A252CliCod ;
   private String[] P04WC2_A45AlbRef ;
   private String[] P04WC2_A6463AlbRLote ;
   private String[] P04WC2_A8028AlbNumB ;
   private int[] P04WC2_A44AlbRecCod ;
}

final  class pactrelcmp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04WC2", "SELECT EmprCod, CliCod, AlbRef, AlbRLote, AlbNumB, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and CliCod = ? and AlbRef = ? and AlbRLote = ? ORDER BY EmprCod, CliCod, AlbRef, AlbRLote ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04WC3", "UPDATE TXPALBREC SET AlbNumB=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 20);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 20);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

