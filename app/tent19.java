package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tent19", "/app.tent19"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tent19 extends GXWebObjectStub
{
   public tent19( )
   {
   }

   public tent19( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tent19.class ));
   }

   public tent19( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tent19_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tent19_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "ENTRADAS EN LA 19";
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

