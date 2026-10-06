package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcformulas", "/app.wcformulas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcformulas extends GXWebObjectStub
{
   public wcformulas( )
   {
   }

   public wcformulas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcformulas.class ));
   }

   public wcformulas( int remoteHandle ,
                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcformulas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcformulas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Colorantes";
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

