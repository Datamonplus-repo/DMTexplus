package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trec1", "/app.trec1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class trec1 extends GXWebObjectStub
{
   public trec1( )
   {
   }

   public trec1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( trec1.class ));
   }

   public trec1( int remoteHandle ,
                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new trec1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new trec1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TRATAMIENTO RECETA-MAQUINA";
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

