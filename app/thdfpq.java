package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.thdfpq", "/app.thdfpq"})
@jakarta.servlet.annotation.MultipartConfig
public final  class thdfpq extends GXWebObjectStub
{
   public thdfpq( )
   {
   }

   public thdfpq( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( thdfpq.class ));
   }

   public thdfpq( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new thdfpq_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new thdfpq_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TRATAMIENTO QUIMICO P/FASES";
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

