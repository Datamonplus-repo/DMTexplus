package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcfaseshdr", "/app.wcfaseshdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcfaseshdr extends GXWebObjectStub
{
   public wcfaseshdr( )
   {
   }

   public wcfaseshdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcfaseshdr.class ));
   }

   public wcfaseshdr( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcfaseshdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcfaseshdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Fases Hdr";
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

