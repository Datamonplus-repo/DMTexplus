package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tttacc", "/app.tttacc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tttacc extends GXWebObjectStub
{
   public tttacc( )
   {
   }

   public tttacc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tttacc.class ));
   }

   public tttacc( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tttacc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tttacc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TEST TRANSPIRACION/AGUA,PARM";
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

