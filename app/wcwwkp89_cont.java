package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwwkp89_cont", "/app.wcwwkp89_cont"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwwkp89_cont extends GXWebObjectStub
{
   public wcwwkp89_cont( )
   {
   }

   public wcwwkp89_cont( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwwkp89_cont.class ));
   }

   public wcwwkp89_cont( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwwkp89_cont_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwwkp89_cont_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informacion del producto";
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

