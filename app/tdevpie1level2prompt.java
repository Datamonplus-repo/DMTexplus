package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpie1level2prompt", "/app.tdevpie1level2prompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpie1level2prompt extends GXWebObjectStub
{
   public tdevpie1level2prompt( )
   {
   }

   public tdevpie1level2prompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpie1level2prompt.class ));
   }

   public tdevpie1level2prompt( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpie1level2prompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpie1level2prompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Level2";
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

