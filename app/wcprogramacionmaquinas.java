package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcprogramacionmaquinas", "/app.wcprogramacionmaquinas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcprogramacionmaquinas extends GXWebObjectStub
{
   public wcprogramacionmaquinas( )
   {
   }

   public wcprogramacionmaquinas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcprogramacionmaquinas.class ));
   }

   public wcprogramacionmaquinas( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcprogramacionmaquinas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcprogramacionmaquinas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProgramacion Maquinas";
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

