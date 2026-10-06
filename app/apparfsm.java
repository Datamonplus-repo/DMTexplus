package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apparfsm extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apparfsm pgm = new apparfsm (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apparfsm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apparfsm.class ), "" );
   }

   public apparfsm( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03UY2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9832MaqCodF = P03UY2_A9832MaqCodF[0] ;
         A457FasCod = P03UY2_A457FasCod[0] ;
         A396EmprCod = P03UY2_A396EmprCod[0] ;
         A9834Cod_parF = P03UY2_A9834Cod_parF[0] ;
         /*
            INSERT RECORD ON TABLE TXPPARFSM

         */
         W396EmprCod = A396EmprCod ;
         W457FasCod = A457FasCod ;
         W9832MaqCodF = A9832MaqCodF ;
         W9860MaqAnc = A9860MaqAnc ;
         n9860MaqAnc = false ;
         A9860MaqAnc = (short)(999) ;
         n9860MaqAnc = false ;
         /* Using cursor P03UY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, A457FasCod, A9832MaqCodF, Boolean.valueOf(n9860MaqAnc), Short.valueOf(A9860MaqAnc)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARFSM");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A457FasCod = W457FasCod ;
         A9832MaqCodF = W9832MaqCodF ;
         A9860MaqAnc = W9860MaqAnc ;
         n9860MaqAnc = false ;
         /* End Insert */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pparfsm.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apparfsm");
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
      P03UY2_A9832MaqCodF = new String[] {""} ;
      P03UY2_A457FasCod = new String[] {""} ;
      P03UY2_A396EmprCod = new String[] {""} ;
      P03UY2_A9834Cod_parF = new short[1] ;
      A9832MaqCodF = "" ;
      A457FasCod = "" ;
      A396EmprCod = "" ;
      W396EmprCod = "" ;
      W457FasCod = "" ;
      W9832MaqCodF = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apparfsm__default(),
         new Object[] {
             new Object[] {
            P03UY2_A9832MaqCodF, P03UY2_A457FasCod, P03UY2_A396EmprCod, P03UY2_A9834Cod_parF
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A9834Cod_parF ;
   private short W9860MaqAnc ;
   private short A9860MaqAnc ;
   private short Gx_err ;
   private int GX_INS1290 ;
   private String scmdbuf ;
   private String A9832MaqCodF ;
   private String A457FasCod ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String W457FasCod ;
   private String W9832MaqCodF ;
   private String Gx_emsg ;
   private boolean n9860MaqAnc ;
   private IDataStoreProvider pr_default ;
   private String[] P03UY2_A9832MaqCodF ;
   private String[] P03UY2_A457FasCod ;
   private String[] P03UY2_A396EmprCod ;
   private short[] P03UY2_A9834Cod_parF ;
}

final  class apparfsm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03UY2", "SELECT MaqCodF, FasCod, EmprCod, Cod_parF FROM TXPPRFSMQ ORDER BY EmprCod, FasCod, MaqCodF, Cod_parF ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03UY3", "INSERT INTO TXPPARFSM(EmprCod, FasCod, MaqCodF, MaqAnc) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPARFSM")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 6);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               return;
      }
   }

}

