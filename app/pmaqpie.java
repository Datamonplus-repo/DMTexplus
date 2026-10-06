package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmaqpie extends GXProcedure
{
   public pmaqpie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmaqpie.class ), "" );
   }

   public pmaqpie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      pmaqpie.this.AV8EmprCod = aP0;
      pmaqpie.this.AV9MaqCod = aP1;
      pmaqpie.this.AV10MaqDsc = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPMaqPie

      */
      A396EmprCod = AV8EmprCod ;
      A602MaqCod = AV9MaqCod ;
      A11437MaqPieShw = (byte)(1) ;
      A11438MaqEquCod = "   " ;
      A11435MaqEquDsc = "" ;
      A11439MaqSEqCod = "   " ;
      A11441MaqSEqDsc = "" ;
      A11440MaqPieCod = "    " ;
      A11436MaqPieDsc = AV10MaqDsc ;
      n11436MaqPieDsc = false ;
      /* Using cursor P04JH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A602MaqCod, A11438MaqEquCod, A11439MaqSEqCod, A11440MaqPieCod, A11435MaqEquDsc, Boolean.valueOf(n11436MaqPieDsc), A11436MaqPieDsc, Byte.valueOf(A11437MaqPieShw), A11441MaqSEqDsc});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMaqPie");
      if ( (pr_default.getStatus(0) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         n11436MaqPieDsc = false ;
         /* Optimized UPDATE. */
         /* Using cursor P04JH3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n11436MaqPieDsc), AV10MaqDsc, AV8EmprCod, AV9MaqCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMaqPie");
         /* End optimized UPDATE. */
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      A11438MaqEquCod = "" ;
      A11435MaqEquDsc = "" ;
      A11439MaqSEqCod = "" ;
      A11441MaqSEqDsc = "" ;
      A11440MaqPieCod = "" ;
      A11436MaqPieDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmaqpie__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A11437MaqPieShw ;
   private short Gx_err ;
   private int GX_INS1519 ;
   private String AV8EmprCod ;
   private String AV9MaqCod ;
   private String AV10MaqDsc ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String A11438MaqEquCod ;
   private String A11435MaqEquDsc ;
   private String A11439MaqSEqCod ;
   private String A11441MaqSEqDsc ;
   private String A11440MaqPieCod ;
   private String A11436MaqPieDsc ;
   private String Gx_emsg ;
   private boolean n11436MaqPieDsc ;
   private IDataStoreProvider pr_default ;
}

final  class pmaqpie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P04JH2", "INSERT INTO TXPMaqPie(EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod, MaqEquDsc, MaqPieDsc, MaqPieShw, MaqSEqDsc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMaqPie")
         ,new UpdateCursor("P04JH3", "UPDATE TXPMaqPie SET MaqPieDsc=?, MaqPieShw=1  WHERE EmprCod = ? and MaqCod = ? and MaqEquCod = '   ' and MaqSEqCod = '   ' and MaqPieCod = '    '", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMaqPie")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setString(5, (String)parms[4], 10);
               stmt.setString(6, (String)parms[5], 100);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 100);
               }
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 100);
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 100);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
      }
   }

}

