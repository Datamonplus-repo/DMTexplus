package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.informealbaranesproduccionww", "/app.informealbaranesproduccionww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class informealbaranesproduccionww extends GXWebObjectStub
{
   public informealbaranesproduccionww( )
   {
   }

   public informealbaranesproduccionww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( informealbaranesproduccionww.class ));
   }

   public informealbaranesproduccionww( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new informealbaranesproduccionww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new informealbaranesproduccionww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Albaranes Producción";
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

