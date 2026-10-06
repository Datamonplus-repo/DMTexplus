package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcrelaciondeformulas", "/app.wcrelaciondeformulas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcrelaciondeformulas extends GXWebObjectStub
{
   public wcrelaciondeformulas( )
   {
   }

   public wcrelaciondeformulas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcrelaciondeformulas.class ));
   }

   public wcrelaciondeformulas( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcrelaciondeformulas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcrelaciondeformulas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Relacion de Formulas";
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

