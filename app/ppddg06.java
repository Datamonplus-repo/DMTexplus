package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppddg06 extends GXProcedure
{
   public ppddg06( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppddg06.class ), "" );
   }

   public ppddg06( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      ppddg06.this.aP2 = new String[] {""};
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
      ppddg06.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppddg06.this.AV34PedDGId = aP1[0];
      this.aP1 = aP1;
      ppddg06.this.A758ProCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV29Parfss ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PARFSS", ""), GXv_int2) ;
      ppddg06.this.GXt_int1 = GXv_int2[0] ;
      AV29Parfss = GXt_int1 ;
      GXt_int3 = AV30Valor ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char5[0] = httpContext.getMessage( "PARFSS", "") ;
      GXv_int6[0] = GXt_int3 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char5, GXv_int6) ;
      ppddg06.this.A396EmprCod = GXv_char4[0] ;
      ppddg06.this.GXt_int3 = GXv_int6[0] ;
      AV30Valor = GXt_int3 ;
      GXt_int1 = AV33PqfdesdeFases ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PQFRFS", ""), GXv_int2) ;
      ppddg06.this.GXt_int1 = GXv_int2[0] ;
      AV33PqfdesdeFases = GXt_int1 ;
      /* Using cursor P05P42 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV34PedDGId)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13026PedDGId = P05P42_A13026PedDGId[0] ;
         A252CliCod = P05P42_A252CliCod[0] ;
         n252CliCod = P05P42_n252CliCod[0] ;
         A13029PedDGArt = P05P42_A13029PedDGArt[0] ;
         n13029PedDGArt = P05P42_n13029PedDGArt[0] ;
         AV17CliCod = A252CliCod ;
         AV18DisartCod = A13029PedDGArt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV28Act_nrq = (byte)(0) ;
      /* Using cursor P05P43 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A774ProNumLin = P05P43_A774ProNumLin[0] ;
         A457FasCod = P05P43_A457FasCod[0] ;
         n457FasCod = P05P43_n457FasCod[0] ;
         A602MaqCod = P05P43_A602MaqCod[0] ;
         n602MaqCod = P05P43_n602MaqCod[0] ;
         A602MaqCod = P05P43_A602MaqCod[0] ;
         n602MaqCod = P05P43_n602MaqCod[0] ;
         W758ProCod = A758ProCod ;
         AV16FasCod = A457FasCod ;
         AV32MaqCod = A602MaqCod ;
         AV19ProNumLin = A774ProNumLin ;
         AV24Procod = A758ProCod ;
         AV25Emprcod = A396EmprCod ;
         /* Execute user subroutine: 'ARTFOR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV26Num_rq > 1 )
         {
            AV28Act_nrq = (byte)(1) ;
         }
         /*
            INSERT RECORD ON TABLE TXPPEDDG5

         */
         W758ProCod = A758ProCod ;
         W457FasCod = A457FasCod ;
         n457FasCod = false ;
         A13026PedDGId = AV34PedDGId ;
         A758ProCod = AV24Procod ;
         A13045PedDGFasLi = A774ProNumLin ;
         A457FasCod = AV16FasCod ;
         n457FasCod = false ;
         A13051PedDGObFas = " " ;
         n13051PedDGObFas = false ;
         A13056PedDGPQUlt = (short)(0) ;
         n13056PedDGPQUlt = false ;
         /* Using cursor P05P44 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n13051PedDGObFas), A13051PedDGObFas, Boolean.valueOf(n13056PedDGPQUlt), Short.valueOf(A13056PedDGPQUlt)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG5");
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
         A758ProCod = W758ProCod ;
         A457FasCod = W457FasCod ;
         n457FasCod = false ;
         /* End Insert */
         if ( ( AV29Parfss == 1 ) && ( AV30Valor == 1 ) )
         {
         }
         else
         {
            /* Using cursor P05P45 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV17CliCod), AV18DisartCod, A758ProCod, Boolean.valueOf(n457FasCod), A457FasCod});
            while ( (pr_default.getStatus(3) != 101) )
            {
               A1668ParFasVal = P05P45_A1668ParFasVal[0] ;
               A1673ParFasObs = P05P45_A1673ParFasObs[0] ;
               A1664ParFasCod = P05P45_A1664ParFasCod[0] ;
               A65ArtCod = P05P45_A65ArtCod[0] ;
               A252CliCod = P05P45_A252CliCod[0] ;
               n252CliCod = P05P45_n252CliCod[0] ;
               /*
                  INSERT RECORD ON TABLE TXPPEDDG8

               */
               A13026PedDGId = AV34PedDGId ;
               A13045PedDGFasLi = A774ProNumLin ;
               A13058PedDGParVa = A1668ParFasVal ;
               n13058PedDGParVa = false ;
               A13059PedDGParOb = A1673ParFasObs ;
               n13059PedDGParOb = false ;
               /* Using cursor P05P46 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A1664ParFasCod), Boolean.valueOf(n13058PedDGParVa), A13058PedDGParVa, Boolean.valueOf(n13059PedDGParOb), A13059PedDGParOb});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG8");
               if ( (pr_default.getStatus(4) == 1) )
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
               pr_default.readNext(3);
            }
            pr_default.close(3);
         }
         A758ProCod = W758ProCod ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'ARTFOR' Routine */
      returnInSub = false ;
      if ( AV33PqfdesdeFases == 1 )
      {
         AV23Disquilin = (short)(1) ;
         /* Using cursor P05P47 */
         pr_default.execute(5, new Object[] {AV25Emprcod, AV16FasCod});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A456FasActTin = P05P47_A456FasActTin[0] ;
            n456FasActTin = P05P47_n456FasActTin[0] ;
            A4286FasForMul = P05P47_A4286FasForMul[0] ;
            n4286FasForMul = P05P47_n4286FasForMul[0] ;
            A457FasCod = P05P47_A457FasCod[0] ;
            n457FasCod = P05P47_n457FasCod[0] ;
            A764ProForCod = P05P47_A764ProForCod[0] ;
            n764ProForCod = P05P47_n764ProForCod[0] ;
            A4650FasForLin = P05P47_A4650FasForLin[0] ;
            A456FasActTin = P05P47_A456FasActTin[0] ;
            n456FasActTin = P05P47_n456FasActTin[0] ;
            A4286FasForMul = P05P47_A4286FasForMul[0] ;
            n4286FasForMul = P05P47_n4286FasForMul[0] ;
            if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) != 0 ) )
            {
               AV22ARTPROCOD = A764ProForCod ;
               /* Execute user subroutine: 'CREODISQUI' */
               S127 ();
               if ( returnInSub )
               {
                  pr_default.close(5);
                  pr_default.close(5);
                  returnInSub = true;
                  if (true) return;
               }
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      else
      {
         AV22ARTPROCOD = " " ;
         AV23Disquilin = (short)(1) ;
         AV26Num_rq = (short)(0) ;
         /* Using cursor P05P48 */
         pr_default.execute(6, new Object[] {AV25Emprcod, Integer.valueOf(AV17CliCod), AV18DisartCod, AV24Procod});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A65ArtCod = P05P48_A65ArtCod[0] ;
            A252CliCod = P05P48_A252CliCod[0] ;
            n252CliCod = P05P48_n252CliCod[0] ;
            A4898ArtProCod = P05P48_A4898ArtProCod[0] ;
            A457FasCod = P05P48_A457FasCod[0] ;
            n457FasCod = P05P48_n457FasCod[0] ;
            A456FasActTin = P05P48_A456FasActTin[0] ;
            n456FasActTin = P05P48_n456FasActTin[0] ;
            A4286FasForMul = P05P48_A4286FasForMul[0] ;
            n4286FasForMul = P05P48_n4286FasForMul[0] ;
            A4897ArtProLin = P05P48_A4897ArtProLin[0] ;
            A456FasActTin = P05P48_A456FasActTin[0] ;
            n456FasActTin = P05P48_n456FasActTin[0] ;
            A4286FasForMul = P05P48_A4286FasForMul[0] ;
            n4286FasForMul = P05P48_n4286FasForMul[0] ;
            AV22ARTPROCOD = A4898ArtProCod ;
            if ( GXutil.strcmp(AV16FasCod, A457FasCod) == 0 )
            {
               if ( ( GXutil.strcmp(A4286FasForMul, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(A456FasActTin, httpContext.getMessage( "S", "")) != 0 ) )
               {
                  /* Execute user subroutine: 'CREODISQUI' */
                  S127 ();
                  if ( returnInSub )
                  {
                     pr_default.close(6);
                     pr_default.close(6);
                     returnInSub = true;
                     if (true) return;
                  }
                  AV26Num_rq = (short)(AV26Num_rq+1) ;
               }
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
   }

   public void S127( )
   {
      /* 'CREODISQUI' Routine */
      returnInSub = false ;
      /*
         INSERT RECORD ON TABLE TXPPEDDG7

      */
      A13026PedDGId = AV34PedDGId ;
      A758ProCod = AV24Procod ;
      A13045PedDGFasLi = AV19ProNumLin ;
      A13057PedDGPQLin = AV23Disquilin ;
      A764ProForCod = AV22ARTPROCOD ;
      n764ProForCod = false ;
      /* Using cursor P05P49 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13026PedDGId), A758ProCod, Short.valueOf(A13045PedDGFasLi), Short.valueOf(A13057PedDGPQLin), Boolean.valueOf(n764ProForCod), A764ProForCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPEDDG7");
      if ( (pr_default.getStatus(7) == 1) )
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
      AV23Disquilin = (short)(AV23Disquilin+1) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppddg06.this.A396EmprCod;
      this.aP1[0] = ppddg06.this.AV34PedDGId;
      this.aP2[0] = ppddg06.this.A758ProCod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ppddg06");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_char4 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P05P42_A396EmprCod = new String[] {""} ;
      P05P42_A13026PedDGId = new int[1] ;
      P05P42_A252CliCod = new int[1] ;
      P05P42_n252CliCod = new boolean[] {false} ;
      P05P42_A13029PedDGArt = new String[] {""} ;
      P05P42_n13029PedDGArt = new boolean[] {false} ;
      A13029PedDGArt = "" ;
      AV18DisartCod = "" ;
      P05P43_A396EmprCod = new String[] {""} ;
      P05P43_A758ProCod = new String[] {""} ;
      P05P43_A774ProNumLin = new short[1] ;
      P05P43_A457FasCod = new String[] {""} ;
      P05P43_n457FasCod = new boolean[] {false} ;
      P05P43_A602MaqCod = new String[] {""} ;
      P05P43_n602MaqCod = new boolean[] {false} ;
      A457FasCod = "" ;
      A602MaqCod = "" ;
      W758ProCod = "" ;
      AV16FasCod = "" ;
      AV32MaqCod = "" ;
      AV24Procod = "" ;
      AV25Emprcod = "" ;
      W457FasCod = "" ;
      A13051PedDGObFas = "" ;
      Gx_emsg = "" ;
      P05P45_A396EmprCod = new String[] {""} ;
      P05P45_A758ProCod = new String[] {""} ;
      P05P45_A457FasCod = new String[] {""} ;
      P05P45_n457FasCod = new boolean[] {false} ;
      P05P45_A1668ParFasVal = new String[] {""} ;
      P05P45_A1673ParFasObs = new String[] {""} ;
      P05P45_A1664ParFasCod = new short[1] ;
      P05P45_A65ArtCod = new String[] {""} ;
      P05P45_A252CliCod = new int[1] ;
      P05P45_n252CliCod = new boolean[] {false} ;
      A1668ParFasVal = "" ;
      A1673ParFasObs = "" ;
      A65ArtCod = "" ;
      A13058PedDGParVa = "" ;
      A13059PedDGParOb = "" ;
      P05P47_A456FasActTin = new String[] {""} ;
      P05P47_n456FasActTin = new boolean[] {false} ;
      P05P47_A4286FasForMul = new String[] {""} ;
      P05P47_n4286FasForMul = new boolean[] {false} ;
      P05P47_A457FasCod = new String[] {""} ;
      P05P47_n457FasCod = new boolean[] {false} ;
      P05P47_A396EmprCod = new String[] {""} ;
      P05P47_A764ProForCod = new String[] {""} ;
      P05P47_n764ProForCod = new boolean[] {false} ;
      P05P47_A4650FasForLin = new short[1] ;
      A456FasActTin = "" ;
      A4286FasForMul = "" ;
      A764ProForCod = "" ;
      AV22ARTPROCOD = "" ;
      P05P48_A758ProCod = new String[] {""} ;
      P05P48_A65ArtCod = new String[] {""} ;
      P05P48_A252CliCod = new int[1] ;
      P05P48_n252CliCod = new boolean[] {false} ;
      P05P48_A396EmprCod = new String[] {""} ;
      P05P48_A4898ArtProCod = new String[] {""} ;
      P05P48_A457FasCod = new String[] {""} ;
      P05P48_n457FasCod = new boolean[] {false} ;
      P05P48_A456FasActTin = new String[] {""} ;
      P05P48_n456FasActTin = new boolean[] {false} ;
      P05P48_A4286FasForMul = new String[] {""} ;
      P05P48_n4286FasForMul = new boolean[] {false} ;
      P05P48_A4897ArtProLin = new short[1] ;
      A4898ArtProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppddg06__default(),
         new Object[] {
             new Object[] {
            P05P42_A396EmprCod, P05P42_A13026PedDGId, P05P42_A252CliCod, P05P42_n252CliCod, P05P42_A13029PedDGArt, P05P42_n13029PedDGArt
            }
            , new Object[] {
            P05P43_A396EmprCod, P05P43_A758ProCod, P05P43_A774ProNumLin, P05P43_A457FasCod, P05P43_A602MaqCod, P05P43_n602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05P45_A396EmprCod, P05P45_A758ProCod, P05P45_A457FasCod, P05P45_A1668ParFasVal, P05P45_A1673ParFasObs, P05P45_A1664ParFasCod, P05P45_A65ArtCod, P05P45_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            P05P47_A456FasActTin, P05P47_n456FasActTin, P05P47_A4286FasForMul, P05P47_n4286FasForMul, P05P47_A457FasCod, P05P47_A396EmprCod, P05P47_A764ProForCod, P05P47_A4650FasForLin
            }
            , new Object[] {
            P05P48_A758ProCod, P05P48_A65ArtCod, P05P48_A252CliCod, P05P48_A396EmprCod, P05P48_A4898ArtProCod, P05P48_A457FasCod, P05P48_A456FasActTin, P05P48_n456FasActTin, P05P48_A4286FasForMul, P05P48_n4286FasForMul,
            P05P48_A4897ArtProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV29Parfss ;
   private byte AV33PqfdesdeFases ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV28Act_nrq ;
   private short A774ProNumLin ;
   private short AV19ProNumLin ;
   private short AV26Num_rq ;
   private short A13045PedDGFasLi ;
   private short A13056PedDGPQUlt ;
   private short Gx_err ;
   private short A1664ParFasCod ;
   private short AV23Disquilin ;
   private short A4650FasForLin ;
   private short A4897ArtProLin ;
   private short A13057PedDGPQLin ;
   private int AV34PedDGId ;
   private int AV30Valor ;
   private int GXt_int3 ;
   private int GXv_int6[] ;
   private int A13026PedDGId ;
   private int A252CliCod ;
   private int AV17CliCod ;
   private int GX_INS1786 ;
   private int GX_INS1789 ;
   private int GX_INS1788 ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String scmdbuf ;
   private String A13029PedDGArt ;
   private String AV18DisartCod ;
   private String A457FasCod ;
   private String A602MaqCod ;
   private String W758ProCod ;
   private String AV16FasCod ;
   private String AV32MaqCod ;
   private String AV24Procod ;
   private String AV25Emprcod ;
   private String W457FasCod ;
   private String Gx_emsg ;
   private String A1668ParFasVal ;
   private String A1673ParFasObs ;
   private String A65ArtCod ;
   private String A13058PedDGParVa ;
   private String A13059PedDGParOb ;
   private String A456FasActTin ;
   private String A4286FasForMul ;
   private String A764ProForCod ;
   private String AV22ARTPROCOD ;
   private String A4898ArtProCod ;
   private boolean n252CliCod ;
   private boolean n13029PedDGArt ;
   private boolean n457FasCod ;
   private boolean n602MaqCod ;
   private boolean returnInSub ;
   private boolean n13051PedDGObFas ;
   private boolean n13056PedDGPQUlt ;
   private boolean n13058PedDGParVa ;
   private boolean n13059PedDGParOb ;
   private boolean n456FasActTin ;
   private boolean n4286FasForMul ;
   private boolean n764ProForCod ;
   private String A13051PedDGObFas ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P05P42_A396EmprCod ;
   private int[] P05P42_A13026PedDGId ;
   private int[] P05P42_A252CliCod ;
   private boolean[] P05P42_n252CliCod ;
   private String[] P05P42_A13029PedDGArt ;
   private boolean[] P05P42_n13029PedDGArt ;
   private String[] P05P43_A396EmprCod ;
   private String[] P05P43_A758ProCod ;
   private short[] P05P43_A774ProNumLin ;
   private String[] P05P43_A457FasCod ;
   private boolean[] P05P43_n457FasCod ;
   private String[] P05P43_A602MaqCod ;
   private boolean[] P05P43_n602MaqCod ;
   private String[] P05P45_A396EmprCod ;
   private String[] P05P45_A758ProCod ;
   private String[] P05P45_A457FasCod ;
   private boolean[] P05P45_n457FasCod ;
   private String[] P05P45_A1668ParFasVal ;
   private String[] P05P45_A1673ParFasObs ;
   private short[] P05P45_A1664ParFasCod ;
   private String[] P05P45_A65ArtCod ;
   private int[] P05P45_A252CliCod ;
   private boolean[] P05P45_n252CliCod ;
   private String[] P05P47_A456FasActTin ;
   private boolean[] P05P47_n456FasActTin ;
   private String[] P05P47_A4286FasForMul ;
   private boolean[] P05P47_n4286FasForMul ;
   private String[] P05P47_A457FasCod ;
   private boolean[] P05P47_n457FasCod ;
   private String[] P05P47_A396EmprCod ;
   private String[] P05P47_A764ProForCod ;
   private boolean[] P05P47_n764ProForCod ;
   private short[] P05P47_A4650FasForLin ;
   private String[] P05P48_A758ProCod ;
   private String[] P05P48_A65ArtCod ;
   private int[] P05P48_A252CliCod ;
   private boolean[] P05P48_n252CliCod ;
   private String[] P05P48_A396EmprCod ;
   private String[] P05P48_A4898ArtProCod ;
   private String[] P05P48_A457FasCod ;
   private boolean[] P05P48_n457FasCod ;
   private String[] P05P48_A456FasActTin ;
   private boolean[] P05P48_n456FasActTin ;
   private String[] P05P48_A4286FasForMul ;
   private boolean[] P05P48_n4286FasForMul ;
   private short[] P05P48_A4897ArtProLin ;
}

final  class ppddg06__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05P42", "SELECT EmprCod, PedDGId, CliCod, PedDGArt FROM TXPPEDDG1 WHERE EmprCod = ? and PedDGId = ? ORDER BY EmprCod, PedDGId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P05P43", "SELECT T1.EmprCod, T1.ProCod, T1.ProNumLin, T1.FasCod, T2.MaqCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05P44", "INSERT INTO TXPPEDDG5(EmprCod, PedDGId, ProCod, PedDGFasLi, FasCod, PedDGObFas, PedDGPQUlt) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG5")
         ,new ForEachCursor("P05P45", "SELECT EmprCod, ProCod, FasCod, ParFasVal, ParFasObs, ParFasCod, ArtCod, CliCod FROM TXPSERPAR WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05P46", "INSERT INTO TXPPEDDG8(EmprCod, PedDGId, ProCod, PedDGFasLi, ParFasCod, PedDGParVa, PedDGParOb, PedDGParTx) VALUES(?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG8")
         ,new ForEachCursor("P05P47", "SELECT T2.FasActTin, T2.FasForMul, T1.FasCod, T1.EmprCod, T1.ProForCod, T1.FasForLin FROM (TXPFASPR1 T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05P48", "SELECT T1.ProCod, T1.ArtCod, T1.CliCod, T1.EmprCod, T1.ArtProCod, T1.FasCod, T2.FasActTin, T2.FasForMul, T1.ArtProLin FROM (TXPArtFor T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P05P49", "INSERT INTO TXPPEDDG7(EmprCod, PedDGId, ProCod, PedDGFasLi, PedDGPQLin, ProForCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPEDDG7")
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 60);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 3000);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 8);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 60);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               return;
      }
   }

}

