package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.expedicionesautomatizadas.webcontador_metrajepiezas_wc", "/app.expedicionesautomatizadas.webcontador_metrajepiezas_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webcontador_metrajepiezas_wc extends GXWebObjectStub
{
   public webcontador_metrajepiezas_wc( )
   {
   }

   public webcontador_metrajepiezas_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webcontador_metrajepiezas_wc.class ));
   }

   public webcontador_metrajepiezas_wc( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webcontador_metrajepiezas_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webcontador_metrajepiezas_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " LMETPI";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

