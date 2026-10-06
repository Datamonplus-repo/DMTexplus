package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwopesrb", "/app.webwopesrb"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwopesrb extends GXWebObjectStub
{
   public webwopesrb( )
   {
   }

   public webwopesrb( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwopesrb.class ));
   }

   public webwopesrb( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwopesrb_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwopesrb_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "CLAVE ESPECIAL -RELACION BAÑO-";
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

