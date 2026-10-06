package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apsuu001 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apsuu001 pgm = new apsuu001 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {
      String[] aP0 = new String[] {""};
      int[] aP1 = new int[] {0};
      String[] aP2 = new String[] {""};

      try
      {
         aP0[0] = (String) args[0];
         aP1[0] = (int) GXutil.lval( args[1]);
         aP2[0] = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2);
   }

   public apsuu001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apsuu001.class ), "" );
   }

   public apsuu001( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      apsuu001.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      apsuu001.this.AV11Emprcod = aP0[0];
      this.aP0 = aP0;
      apsuu001.this.AV9Clicod = aP1[0];
      this.aP1 = aP1;
      apsuu001.this.AV10Artcod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV15ProArt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV11Emprcod, httpContext.getMessage( "NITITM", ""), GXv_int2) ;
      apsuu001.this.GXt_int1 = GXv_int2[0] ;
      AV15ProArt = GXt_int1 ;
      if ( AV15ProArt == 1 )
      {
         /*
            INSERT RECORD ON TABLE TXPARTLIN

         */
         A396EmprCod = AV11Emprcod ;
         A252CliCod = AV9Clicod ;
         A65ArtCod = AV10Artcod ;
         A758ProCod = GXutil.substring( AV10Artcod, 1, 8) ;
         /* Using cursor P02TT2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPARTLIN");
         if ( (pr_default.getStatus(0) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         AV8Mdlcod = GXutil.substring( AV10Artcod, 1, 13) ;
         /*
            INSERT RECORD ON TABLE TXPModels

         */
         A396EmprCod = AV11Emprcod ;
         A252CliCod = AV9Clicod ;
         A65ArtCod = AV10Artcod ;
         A4658MdlCod = AV8Mdlcod ;
         A4659MdlDsc = " " ;
         n4659MdlDsc = false ;
         /* Using cursor P02TT3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, Boolean.valueOf(n4659MdlDsc), A4659MdlDsc});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModels");
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
         /* End Insert */
         AV14procod = GXutil.substring( AV8Mdlcod, 1, 8) ;
         /*
            INSERT RECORD ON TABLE TXPModPro

         */
         A396EmprCod = AV11Emprcod ;
         A252CliCod = AV9Clicod ;
         A65ArtCod = AV10Artcod ;
         A4658MdlCod = AV8Mdlcod ;
         A758ProCod = AV14procod ;
         /* Using cursor P02TT4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A4658MdlCod, A758ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPModPro");
         if ( (pr_default.getStatus(2) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         System.out.println( httpContext.getMessage( "Creada Tabla Modelos...", "") );
      }
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(psuu001.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      this.aP0[0] = apsuu001.this.AV11Emprcod;
      this.aP1[0] = apsuu001.this.AV9Clicod;
      this.aP2[0] = apsuu001.this.AV10Artcod;
      Application.commitDataStores(context, remoteHandle, pr_default, "apsuu001");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      A396EmprCod = "" ;
      A65ArtCod = "" ;
      A758ProCod = "" ;
      Gx_emsg = "" ;
      AV8Mdlcod = "" ;
      A4658MdlCod = "" ;
      A4659MdlDsc = "" ;
      AV14procod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apsuu001__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15ProArt ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short Gx_err ;
   private int AV9Clicod ;
   private int GX_INS11 ;
   private int A252CliCod ;
   private int GX_INS696 ;
   private int GX_INS697 ;
   private String AV11Emprcod ;
   private String AV10Artcod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String Gx_emsg ;
   private String AV8Mdlcod ;
   private String A4658MdlCod ;
   private String A4659MdlDsc ;
   private String AV14procod ;
   private boolean n4659MdlDsc ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class apsuu001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P02TT2", "INSERT INTO TXPARTLIN(EmprCod, CliCod, ArtCod, ProCod, Art_GrmA, Art_AncA, Art_Merma, Art_PmlA, Art_Eanc, Art_Elar, Art_Enc, Art_Cor, Art_Rdo, Art_Rdpc, Art_Fabs, Art_AncB, Art_GrmB, Art_GrmC, Art_AncC, Art_PmlC, Art_GrmP, Art_PmlP, Art_AncP, Art_RdoP, Art_Dsc, Art_Und, Art_Obs, Art_ets, Art_els, DscCFa, ProAct, ProUserA, ProFecA, ProUserM, ProFecM, ProFabs, ProSta, ProStFec, Art_Tipo) VALUES(?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPARTLIN")
         ,new UpdateCursor("P02TT3", "INSERT INTO TXPModels(EmprCod, CliCod, ArtCod, MdlCod, MdlDsc) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPModels")
         ,new UpdateCursor("P02TT4", "INSERT INTO TXPModPro(EmprCod, CliCod, ArtCod, MdlCod, ProCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPModPro")
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 40);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

