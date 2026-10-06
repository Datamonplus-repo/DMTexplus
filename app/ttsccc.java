package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ttsccc", "/app.ttsccc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class ttsccc extends GXWebObjectStub
{
   public ttsccc( )
   {
   }

   public ttsccc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( ttsccc.class ));
   }

   public ttsccc( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ttsccc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new ttsccc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST SOLIDEZ LAVADO,PARM";
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

