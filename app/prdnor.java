package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.prdnor", "/app.prdnor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class prdnor extends GXWebObjectStub
{
   public prdnor( )
   {
   }

   public prdnor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( prdnor.class ));
   }

   public prdnor( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new prdnor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new prdnor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Table PrdNor";
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

