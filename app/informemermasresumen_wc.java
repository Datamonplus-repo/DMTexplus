package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informemermasresumen_wc", "/app.informemermasresumen_wc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informemermasresumen_wc extends GXWebObjectStub
{
   public informemermasresumen_wc( )
   {
   }

   public informemermasresumen_wc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informemermasresumen_wc.class ));
   }

   public informemermasresumen_wc( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informemermasresumen_wc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informemermasresumen_wc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe de Mermas Resumido";
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

