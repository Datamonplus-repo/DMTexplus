package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informemermasdetallado_wc", "/app.informemermasdetallado_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informemermasdetallado_wc extends GXWebObjectStub
{
   public informemermasdetallado_wc( )
   {
   }

   public informemermasdetallado_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informemermasdetallado_wc.class ));
   }

   public informemermasdetallado_wc( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informemermasdetallado_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informemermasdetallado_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Mermas";
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

